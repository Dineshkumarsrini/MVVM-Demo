package com.ait.weather.Repository.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class WCList {

    @SerializedName("dt")
    @Expose
    private var dt: Int? = null

    @SerializedName("sunrise")
    @Expose
    private var sunrise: Int? = null

    @SerializedName("sunset")
    @Expose
    private var sunset: Int? = null

    @SerializedName("temp")
    @Expose
    private var temp: WCTemp? = null

    @SerializedName("feels_like")
    @Expose
    private var feelsLike: WCFeelsLike? = null

    @SerializedName("pressure")
    @Expose
    private var pressure: Int? = null

    @SerializedName("humidity")
    @Expose
    private var humidity: Int? = null

    @SerializedName("weather")
    @Expose
    private var weather: List<WCWeather?>? = null

    @SerializedName("speed")
    @Expose
    private var speed: Double? = null

    @SerializedName("deg")
    @Expose
    private var deg: Int? = null

    @SerializedName("clouds")
    @Expose
    private var clouds: Int? = null

    @SerializedName("pop")
    @Expose
    private var pop: Double? = null

    @SerializedName("snow")
    @Expose
    private var snow: Double? = null

    @SerializedName("rain")
    @Expose
    private var rain: Double? = null

    fun getDt(): Int? {
        return dt
    }

    fun setDt(dt: Int?) {
        this.dt = dt
    }

    fun getSunrise(): Int? {
        return sunrise
    }

    fun setSunrise(sunrise: Int?) {
        this.sunrise = sunrise
    }

    fun getSunset(): Int? {
        return sunset
    }

    fun setSunset(sunset: Int?) {
        this.sunset = sunset
    }

    fun getTemp(): WCTemp? {
        return temp
    }

    fun setTemp(temp: WCTemp?) {
        this.temp = temp
    }

    fun getFeelsLike(): WCFeelsLike? {
        return feelsLike
    }

    fun setFeelsLike(feelsLike: WCFeelsLike?) {
        this.feelsLike = feelsLike
    }

    fun getPressure(): Int? {
        return pressure
    }

    fun setPressure(pressure: Int?) {
        this.pressure = pressure
    }

    fun getHumidity(): Int? {
        return humidity
    }

    fun setHumidity(humidity: Int?) {
        this.humidity = humidity
    }

    fun getWeather(): List<WCWeather?>? {
        return weather
    }

    fun setWeather(weather: List<WCWeather?>?) {
        this.weather = weather
    }

    fun getSpeed(): Double? {
        return speed
    }

    fun setSpeed(speed: Double?) {
        this.speed = speed
    }

    fun getDeg(): Int? {
        return deg
    }

    fun setDeg(deg: Int?) {
        this.deg = deg
    }

    fun getClouds(): Int? {
        return clouds
    }

    fun setClouds(clouds: Int?) {
        this.clouds = clouds
    }

    fun getPop(): Double? {
        return pop
    }

    fun setPop(pop: Double?) {
        this.pop = pop
    }

    fun getSnow(): Double? {
        return snow
    }

    fun setSnow(snow: Double?) {
        this.snow = snow
    }

    fun getRain(): Double? {
        return rain
    }

    fun setRain(rain: Double?) {
        this.rain = rain
    }

}