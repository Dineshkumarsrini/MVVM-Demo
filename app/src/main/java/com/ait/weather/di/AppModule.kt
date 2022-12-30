package com.ait.weather.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val mApplication : Application) {

    @Provides
    fun provideApplication():Application = mApplication

}