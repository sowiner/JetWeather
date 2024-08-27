package com.sowinsoft.jetweather.screens.main

import androidx.lifecycle.ViewModel
import com.sowinsoft.jetweather.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: WeatherRepository) :
    ViewModel() {
    suspend fun getWeatherAll(dataId: String) = repository.getWeatherAll(dataId)
}
