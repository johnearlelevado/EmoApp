package com.example.emoapp.data

interface DataSource {
    suspend fun getLevels(): String?
}