package com.ait.weather.Repository.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class WCCoord {
    @SerializedName("lon")
    @Expose
    private var lon: Double? = null

    @SerializedName("lat")
    @Expose
    private var lat: Double? = null

    fun getLon(): Double? {
        return lon
    }

    fun setLon(lon: Double?) {
        this.lon = lon
    }

    fun getLat(): Double? {
        return lat
    }

    fun setLat(lat: Double?) {
        this.lat = lat
    }
}