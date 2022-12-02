package com.ait.weather.Repository

import android.content.Context
import android.content.SharedPreferences

class WCPreference(context: Context){
    private val SHARED_PREF_NAME = "USER"
    var sharedpreferences : SharedPreferences?
    init{
        this.sharedpreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }
    var editor = sharedpreferences?.edit()
    var climate:String?
        get() {
            return sharedpreferences?.getString(SHARED_PREF_NAME, "")
        }
        set(value) {
            val prefsEditor = editor
            prefsEditor?.putString(SHARED_PREF_NAME, value)?.apply ()
        }
    fun clearSharedPreference()
    {
        val prefsEditor = editor
        prefsEditor?.clear()?.apply()
    }
}