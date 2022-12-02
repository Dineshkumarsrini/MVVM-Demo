package com.ait.weather.Repository

import com.ait.weather.utilities.Status

data class WCResponse<out T>(val status:Status?,val data:T?,val message:String?) {
    companion object{

        fun<T> success(data:T?):WCResponse<T>{
            return WCResponse(Status.SUCCESS, data, "")
        }

        fun <T> error(msg: String): WCResponse<T> {
            return WCResponse(Status.ERROR, null, msg)
        }

        fun <T> loading(data: T?): WCResponse<T> {
            return WCResponse(Status.LOADING, data, null)
        }
    }
}