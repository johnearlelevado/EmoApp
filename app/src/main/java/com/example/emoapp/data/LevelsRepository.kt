package com.example.emoapp.data

import javax.inject.Inject

class LevelsRepository @Inject constructor(private val dataSource: DataSource) {

    suspend fun getLevels():String? {
        return dataSource.getLevels()
    }
}