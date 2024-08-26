package com.sowinsoft.jetweather.api

import com.sowinsoft.jetweather.model.WeatherModel
import com.sowinsoft.jetweather.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {
    @GET("{dataId}")
    suspend fun getWeatherAll(
        @Path("dataId") dataId: String = "F-D0047-091",
        @Query("Authorization") apiKey: String = Constants.API_KEY,
    ): WeatherModel
}