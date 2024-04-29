package com.example.emoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class EmoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}