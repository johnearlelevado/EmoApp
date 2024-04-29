package com.example.emoapp.di

import android.content.Context
import com.example.emoapp.data.DataSource
import com.example.emoapp.data.LevelsLocalDataSource
import com.example.emoapp.data.LevelsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class, ViewModelComponent::class)
class AppModule {

    @Provides
    fun providesDataSource(@ApplicationContext appContext: Context): DataSource {
        return LevelsLocalDataSource(appContext)
    }

}

