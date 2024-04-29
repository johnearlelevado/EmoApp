package com.example.emoapp

import com.example.emoapp.data.DataSource

class FakeErrorDataSource : DataSource {
        override suspend fun getLevels(): String? {
            return ""
        }

    }