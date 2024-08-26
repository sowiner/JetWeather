package com.sowinsoft.jetweather.model

data class WeatherModel(
    val records: Records,
    val result: Result,
    val success: String
)