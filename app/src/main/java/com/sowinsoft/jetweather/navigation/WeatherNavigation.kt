package com.sowinsoft.jetweather.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sowinsoft.jetweather.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = WeatherNavScreens.SplashScreen.name) {
        composable(WeatherNavScreens.SplashScreen.name) { WeatherSplashScreen(nav = nav) }

    }
}

