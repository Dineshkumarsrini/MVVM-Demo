package com.ait.weather.di

import com.ait.weather.weather_climate.WeatherClimateActivity
import com.ait.weather.weather_climate.WeatherClimateViewModel
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Scope
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ApiModule::class,ViewModelFactoryModule::class,ActivityModule::class])
interface AppComponent {

    fun inject(activity:WeatherClimateActivity)
    fun inject(weatherClimateViewModel: WeatherClimateViewModel)

}
