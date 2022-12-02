package com.ait.weather.Repository

import com.google.gson.GsonBuilder
import com.ait.weather.Repository.model.WCExample
import com.ait.weather.common.WCApplication.Companion.instance
import com.ait.weather.retrofit.WCRetrofit

object WCRepository {
    var BASE_URL: String = "https://api.openweathermap.org/"
    fun getClimate()=WCRetrofit.retrofit()?.getClimate()

    fun saveInSharedPreference(climate:WCExample?) {
        val userGson = GsonBuilder().create()
        val city: String? = userGson.toJson(climate)
        instance?.getPrefer()?.climate = city
    }

    fun retrieveFromSharedPreference(): String? = instance?.getPrefer()?.climate

}