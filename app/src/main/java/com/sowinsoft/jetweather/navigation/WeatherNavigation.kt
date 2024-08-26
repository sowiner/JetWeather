package com.sowinsoft.jetweather.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sowinsoft.jetweather.screens.main.HomeScreen
import com.sowinsoft.jetweather.screens.main.HomeScreenViewModel
import com.sowinsoft.jetweather.screens.splash.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = WeatherNavScreens.SplashScreen.name) {
        composable(WeatherNavScreens.SplashScreen.name) {
            WeatherSplashScreen(nav)
        }

        composable(WeatherNavScreens.HomeScreen.name) {
            val hv = hiltViewModel<HomeScreenViewModel>()
            HomeScreen(nav, hv)
        }

    }
}

