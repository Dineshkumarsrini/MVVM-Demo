package com.ait.weather.Repository

import com.ait.weather.service.WCClient
import javax.inject.Inject

class ApiCall @Inject constructor(val client : WCClient) {
    fun getClimate()= client.getClimate()
}