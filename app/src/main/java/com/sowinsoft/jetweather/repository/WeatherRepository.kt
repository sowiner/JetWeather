package com.sowinsoft.jetweather.repository

import com.sowinsoft.jetweather.api.WeatherApi
import com.sowinsoft.jetweather.data.DataOrException
import com.sowinsoft.jetweather.model.WeatherModel
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi) {
    suspend fun getWeatherAll(dataId: String): DataOrException<WeatherModel, Exception, Boolean> {
        val response = try {
            api.getWeatherAll(dataId)
        } catch (e: Exception) {
            return DataOrException(exception = e)
        }
        return DataOrException(data = response)
    }
}