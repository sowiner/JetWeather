package com.sowinsoft.jetweather.model

data class WeatherElement(
    val description: String,
    val elementName: String,
    val time: List<Time>
)