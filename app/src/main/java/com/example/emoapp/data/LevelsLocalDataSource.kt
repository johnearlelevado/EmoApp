package com.example.emoapp.data

import android.content.Context
import com.example.emoapp.R
import com.example.emoapp.utils.Util
import javax.inject.Inject

class LevelsLocalDataSource @Inject constructor(private val context: Context) : DataSource {
    override suspend fun getLevels(): String? {
        return Util.readRawResourceAsString(context,R.raw.response)
    }
}