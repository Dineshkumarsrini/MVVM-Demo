package com.ait.weather.Repository.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class WCCity {
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("coord")
    @Expose
    private var coord: WCCoord? = null

    @SerializedName("country")
    @Expose
    private var country: String? = null

    @SerializedName("population")
    @Expose
    private var population: Int? = null

    @SerializedName("timezone")
    @Expose
    private var timezone: Int? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCoord(): WCCoord? {
        return coord
    }

    fun setCoord(coord: WCCoord?) {
        this.coord = coord
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getPopulation(): Int? {
        return population
    }

    fun setPopulation(population: Int?) {
        this.population = population
    }

    fun getTimezone(): Int? {
        return timezone
    }

    fun setTimezone(timezone: Int?) {
        this.timezone = timezone
    }
}