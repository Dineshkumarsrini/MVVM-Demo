package com.ait.weather.Repository.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class WCExample {
    @SerializedName("city")
    @Expose
    private var city: WCCity? = null

    @SerializedName("cod")
    @Expose
    private var cod: String? = null

    @SerializedName("message")
    @Expose
    private var message: Double? = null

    @SerializedName("cnt")
    @Expose
    private var cnt: Int? = null

    @SerializedName("list")
    @Expose
    private var list: List<WCList?>? = null

    fun getCity(): WCCity? {
        return city
    }

    fun setCity(city: WCCity?) {
        this.city = city
    }

    fun getCod(): String? {
        return cod
    }

    fun setCod(cod: String?) {
        this.cod = cod
    }

    fun getMessage(): Double? {
        return message
    }

    fun setMessage(message: Double?) {
        this.message = message
    }

    fun getCnt(): Int? {
        return cnt
    }

    fun setCnt(cnt: Int?) {
        this.cnt = cnt
    }

    fun getList(): List<WCList?>? {
        return list
    }

    fun setList(list: List<WCList?>?) {
        this.list = list
    }
}