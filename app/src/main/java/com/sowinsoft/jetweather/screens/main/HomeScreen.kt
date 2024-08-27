@file:OptIn(ExperimentalMaterial3Api::class)

package com.sowinsoft.jetweather.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.sowinsoft.jetweather.components.BaseScaffold
import com.sowinsoft.jetweather.data.DataOrException
import com.sowinsoft.jetweather.model.WeatherModel

@Composable
fun HomeScreen(nav: NavController, hv: HomeScreenViewModel = hiltViewModel()) {
    BaseScaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Weather App") }
        )
    }) {
        Column(
            modifier = it.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ShowData(hv)
        }
    }
}

@Composable
fun ShowData(hv: HomeScreenViewModel) {
    val wd = produceState<DataOrException<WeatherModel, Exception, Boolean>>(
        initialValue = DataOrException(loading = true)
    ) {
        value = hv.getWeatherAll("F-D0047-091")
    }.value

    if (wd.loading == true) {
        CircularProgressIndicator()
    } else if (wd.data.toString().isNotEmpty()) {
        Text(text = wd.data!!.records.toString())
    }
}
