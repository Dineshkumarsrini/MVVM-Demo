package com.ait.weather.di

import com.ait.weather.weather_climate.WeatherClimateActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeWeatherActivity():WeatherClimateActivity
}