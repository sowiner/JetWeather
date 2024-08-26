package com.sowinsoft.jetweather.screens.splash


import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sowinsoft.jettrivia.R
import com.sowinsoft.jetweather.navigation.WeatherNavScreens
import kotlinx.coroutines.delay

@Composable
fun WeatherSplashScreen(nav: NavController) {
    SplashContent(modifier = Modifier, nav)
}

@Composable
fun SplashContent(
    modifier: Modifier = Modifier,
    nav: NavController
) {
    val scale = remember {
        Animatable(initialValue = 0f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.9f,
            animationSpec = tween(
                durationMillis = 500
            )
        )
        delay(2000L)
        nav.navigate(WeatherNavScreens.HomeScreen.name)
    }

    Surface(
        modifier
            .padding(15.dp)
            .size(330.dp)
            .scale(scale.value),
        color = MaterialTheme.colorScheme.background,
        shape = CircleShape,
        contentColor = Color.White,
        border = BorderStroke(width = 2.dp, color = Color.LightGray)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                painterResource(id = R.drawable.sun),
                contentDescription = "Splash Icon",
                modifier = Modifier.size(95.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = " Splash Screen?",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.LightGray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun WeatherSplashScreenPreview() {
    SplashContent(nav = NavController(LocalContext.current))
}