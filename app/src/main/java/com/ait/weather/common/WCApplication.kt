package com.ait.weather.common

import android.app.Application
import android.content.Context
import com.ait.weather.Repository.WCPreference

open class WCApplication: Application() {
    private lateinit var mPreference: WCPreference
    companion object {
        @JvmStatic  var instance: WCApplication?=null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        myPreference(this)
    }

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