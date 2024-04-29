package com.example.emoapp.domain

import com.example.emoapp.data.LevelsRepository
import com.example.emoapp.data.SimpleCache
import com.example.emoapp.data.models.Response
import com.google.gson.Gson
import kotlinx.coroutines.flow.flow
import java.lang.ref.WeakReference
import javax.inject.Inject


class SaveLevelsUseCase @Inject constructor(val levelsRepository: LevelsRepository) {
    operator fun invoke(response: Response){
        SimpleCache.response = WeakReference(response)
    }
}