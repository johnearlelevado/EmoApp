package com.example.emoapp.domain

import com.example.emoapp.data.LevelsRepository
import com.example.emoapp.data.models.Response
import com.google.gson.Gson
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class SaveLevelsUseCase @Inject constructor(val levelsRepository: LevelsRepository) {
    operator fun invoke(response: Response){
        // TODO save response to local cache
    }
}