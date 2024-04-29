package com.example.emoapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.emoapp.data.DataSource
import com.example.emoapp.data.LevelsRepository
import com.example.emoapp.domain.GetLevelsUseCase
import com.example.emoapp.domain.SaveLevelsUseCase
import com.example.emoapp.presentation.MainActivityViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViewModelUnitTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    val testDispatcher = TestCoroutineDispatcher()

    lateinit var viewModel: MainActivityViewModel
    lateinit var getLevelsUseCase: GetLevelsUseCase
    lateinit var saveLevelsUseCase: SaveLevelsUseCase
    lateinit var repository: LevelsRepository
    lateinit var dataSource: DataSource

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun `given that there is a response when the getLevels is triggered, then there should be a value in the uiState`()  {
        dataSource = FakeSuccessDataSource()
        repository = LevelsRepository(dataSource)
        saveLevelsUseCase = SaveLevelsUseCase(repository)
        getLevelsUseCase = GetLevelsUseCase(repository)
        viewModel = MainActivityViewModel(getLevelsUseCase,saveLevelsUseCase)
        viewModel.getLevels()
        assertTrue(viewModel.uiState.value.levelList.size == 1)
    }

    @Test
    fun `given that there is an error in response when the getLevels is triggered, then uiState should be empty`()  {
        dataSource = FakeErrorDataSource()
        repository = LevelsRepository(dataSource)
        saveLevelsUseCase = SaveLevelsUseCase(repository)
        getLevelsUseCase = GetLevelsUseCase(repository)
        viewModel = MainActivityViewModel(getLevelsUseCase,saveLevelsUseCase)
        viewModel.getLevels()
        assertTrue(viewModel.uiState.value.levelList.isEmpty())
    }

}