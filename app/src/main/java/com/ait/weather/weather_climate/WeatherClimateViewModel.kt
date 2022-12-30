package com.ait.weather.weather_climate

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ait.weather.Repository.ApiCall
import com.google.gson.Gson
import com.ait.weather.Repository.WCRepository
import com.ait.weather.Repository.WCResponse
import com.ait.weather.Repository.model.WCExample
import com.ait.weather.common.WCApplication
import com.ait.weather.common.WCApplication.Companion.instance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherClimateViewModel @Inject constructor(mApplication: Application,val apiCall: ApiCall) : AndroidViewModel(mApplication) {

    /*init {
        (mApplication as WCApplication).getComponent().inject(this)
    }*/

   /* @Inject
    lateinit var apiCall: ApiCall*/
    var a =0
    val responseSuccess by lazy{MutableLiveData<WCResponse<WCExample>>()}

    fun setAddressInFormat(value: String) {
        var addressFormat = ""
        val result = value.split(", ")
        for (i in result.indices) {
            addressFormat = if (i == 0)
                result[i]
            else
                addressFormat + ", \n" + result[i]
        }

    }

    fun retrieveClimate(){
        val climate = apiCall.getClimate()
        climate.enqueue(object : Callback<WCExample>{
            override fun onResponse(call: Call<WCExample>, response: Response<WCExample>) {
                if(response.isSuccessful){
                    responseSuccess.postValue(WCResponse.success(response.body()))
                    WCRepository.saveInSharedPreference(response.body())
                }else{
                  responseSuccess.postValue(WCResponse.error("response correct no data"))
                }
            }

            override fun onFailure(call: Call<WCExample>, t: Throwable) {
                responseSuccess.postValue(WCResponse.error("response fail"))
            }
        })
    }

    fun getClimate() :WCExample?{
        val gson = Gson()
        return gson.fromJson(
                WCRepository.retrieveFromSharedPreference(),
                WCExample::class.java
        )
    }
  /*  https://api.openweathermap.org/data/2.5/forecast/daily?q=London&mode=xml&units=metric&cnt=7&appid=&appid=82a3c576ed39bfde1c054ddb73f4cec0
    api.openweathermap.org/data/2.5/forecast/daily?q=london&cnt=7&appid=82a3c576ed39bfde1c054ddb73f4cec0
*/
}