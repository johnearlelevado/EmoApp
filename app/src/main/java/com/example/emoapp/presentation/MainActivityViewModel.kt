package com.example.emoapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.emoapp.data.models.Level
import com.example.emoapp.data.models.Response
import com.example.emoapp.domain.GetLevelsResult
import com.example.emoapp.domain.GetLevelsUseCase
import com.example.emoapp.domain.SaveLevelsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val getLevelsUseCase: GetLevelsUseCase,
    private val saveLevelsUseCase: SaveLevelsUseCase
): ViewModel() {

    private val _uiState = MutableStateFlow(UiState.initial())
    val uiState = _uiState.asStateFlow()

    private val _singleEvent = MutableSharedFlow<SingleEvent>(extraBufferCapacity = 32)
    val singleEvent: SharedFlow<SingleEvent> = _singleEvent.asSharedFlow()

    fun getLevels(){
        viewModelScope.launch {
            val uiState = _uiState.value
            getLevelsUseCase().collect{result->
                when(result){
                    is GetLevelsResult.Loading -> {
                        _uiState.value = uiState.copy(
                            loading = true
                        )
                    }
                    is GetLevelsResult.Success -> {
                        _uiState.value = uiState.copy(
                            loading = false,
                            levelList = result.response.levels
                        )
                        saveLevelsUseCase(result.response)
                    }
                    is GetLevelsResult.Error -> {
                        _uiState.value = uiState.copy(
                            loading = false
                        ).also {
                            _singleEvent.tryEmit(SingleEvent.Error(Exception("Error loading")))
                        }
                    }
                }

            }
        }
    }
}

data class UiState (
    val loading: Boolean,
    val error: String,
    val levelList : List<Level>
){
    companion object {
        fun initial(): UiState = UiState(
            loading = false,
            error = "",
            levelList = listOf()
        )
    }
}

sealed class SingleEvent {
    data class Success(val level: Level): SingleEvent()
    data class Error(val exception: Exception): SingleEvent()
}