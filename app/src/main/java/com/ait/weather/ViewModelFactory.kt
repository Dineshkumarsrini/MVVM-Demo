package com.ait.weather

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ait.weather.Repository.ApiCall
import com.ait.weather.weather_climate.WeatherClimateViewModel
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ViewModelFactory @Inject constructor(val mApplication: Application, val creator: ApiCall) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass == WeatherClimateViewModel::class.java) {
            return WeatherClimateViewModel(mApplication, creator) as T
        }else{
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}