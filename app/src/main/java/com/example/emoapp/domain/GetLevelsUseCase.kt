package com.example.emoapp.domain

import com.example.emoapp.data.LevelsRepository
import com.example.emoapp.data.models.Response
import com.google.gson.Gson
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


sealed class GetLevelsResult {
    object Loading: GetLevelsResult()

    data class Success(val response: Response): GetLevelsResult()

    sealed class Error: GetLevelsResult() {
        class Exception(val error: Throwable? = null): Error()
    }
}

class GetLevelsUseCase @Inject constructor(val levelsRepository: LevelsRepository) {
    suspend operator fun invoke() = flow<GetLevelsResult> {
        try {
            emit(GetLevelsResult.Loading)
            val gson = Gson()
            val response = gson.fromJson(levelsRepository.getLevels(),Response::class.java)
            emit(GetLevelsResult.Success(response))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(GetLevelsResult.Error.Exception(e))
        }
    }
}