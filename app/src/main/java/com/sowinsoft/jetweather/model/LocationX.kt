package com.sowinsoft.jetweather.model

data class LocationX(
    val geocode: String,
    val lat: String,
    val locationName: String,
    val lon: String,
    val weatherElement: List<WeatherElement>
)