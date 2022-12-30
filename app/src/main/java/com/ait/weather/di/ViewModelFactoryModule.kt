package com.ait.weather.di

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ait.weather.Repository.ApiCall
import com.ait.weather.ViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Provider
import javax.inject.Singleton

@Module
class ViewModelFactoryModule {

    @Provides
    @Singleton
    fun viewModelFactory(mApplication: Application,apiCall: ApiCall):ViewModelProvider.Factory{
        return  ViewModelFactory(mApplication,apiCall)
    }
}