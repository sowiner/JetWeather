package com.sowinsoft.jetweather.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BaseScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    content: @Composable (modifier: Modifier) -> Unit
) {
    Scaffold(modifier = modifier, topBar, bottomBar) { innerPadding ->
        content(Modifier.padding(innerPadding))
    }
}