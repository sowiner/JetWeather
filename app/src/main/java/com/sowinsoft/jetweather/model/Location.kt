package com.sowinsoft.jetweather.model

data class Location(
    val dataid: String,
    val datasetDescription: String,
    val location: List<LocationX>,
    val locationsName: String
)