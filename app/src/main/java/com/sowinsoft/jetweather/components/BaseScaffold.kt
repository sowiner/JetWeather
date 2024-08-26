package com.sowinsoft.jetweather.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sowinsoft.jetweather.ui.theme.JetWeatherTheme

//@Composable
//fun BaseScaffold(
//    modifier: Modifier = Modifier,
//    topBar: @Composable () -> Unit = {},
//    bottomBar: @Composable () -> Unit = {},
//    content: @Composable (modifier: Modifier) -> Unit
//) {
//    JetWeatherTheme {
//        Scaffold(modifier = modifier, topBar, bottomBar) { innerPadding ->
//            content(Modifier.padding(innerPadding))
//        }
//    }
//}