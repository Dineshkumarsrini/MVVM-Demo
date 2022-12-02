package com.ait.weather.Repository.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class WCFeelsLike {
    @SerializedName("day")
    @Expose
    private var day: Double? = null

    @SerializedName("night")
    @Expose
    private var night: Double? = null

    @SerializedName("eve")
    @Expose
    private var eve: Double? = null

    @SerializedName("morn")
    @Expose
    private var morn: Double? = null

    fun getDay(): Double? {
        return day
    }

    fun setDay(day: Double?) {
        this.day = day
    }

    fun getNight(): Double? {
        return night
    }

    fun setNight(night: Double?) {
        this.night = night
    }

    fun getEve(): Double? {
        return eve
    }

    fun setEve(eve: Double?) {
        this.eve = eve
    }

    fun getMorn(): Double? {
        return morn
    }

    fun setMorn(morn: Double?) {
        this.morn = morn
    }
}