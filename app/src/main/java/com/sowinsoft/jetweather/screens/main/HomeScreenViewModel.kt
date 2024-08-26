package com.sowinsoft.jetweather.screens.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sowinsoft.jetweather.data.DataOrException
import com.sowinsoft.jetweather.model.WeatherModel
import com.sowinsoft.jetweather.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: WeatherRepository) :
    ViewModel() {
    val data = mutableStateOf<DataOrException<WeatherModel, Exception, Boolean>>(
        DataOrException(
            null,
            null,
            true
        )
    )

    init {
        loadWeather()
    }

    private fun loadWeather() {
        getWeatherAllData()
    }

    private fun getWeatherAllData(dataId: String = "F-D0047-091") {
        viewModelScope.launch {
            data.value.loading = true
            data.value = repository.getWeatherAll(dataId)
            if (data.value.data.toString().isNotEmpty()) data.value.loading = false
        }
    }


}
