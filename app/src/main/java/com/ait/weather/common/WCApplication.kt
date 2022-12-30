package com.ait.weather.common

import android.app.Application
import android.content.Context
import com.ait.weather.Repository.WCPreference
import com.ait.weather.di.ApiModule
import com.ait.weather.di.AppComponent
import com.ait.weather.di.AppModule
import com.ait.weather.di.DaggerAppComponent

open class WCApplication: Application() {
    private lateinit var mPreference: WCPreference
    private lateinit var mAppComponent: AppComponent
    companion object {
        @JvmStatic  var instance: WCApplication?=null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        myPreference(this)
        mAppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).apiModule(ApiModule("https://api.openweathermap.org/")).build()
    }

    public fun getComponent():AppComponent = mAppComponent

    /**creating the preference object*/
    private fun myPreference(context: Context)
    {
        mPreference = WCPreference(context)
    }

    /**getter method for preference object*/
    fun getPrefer(): WCPreference?{
        return mPreference
    }
}