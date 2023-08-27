package com.example.money

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.money.navigation.BottomBar
import com.example.money.navigation.BottomNavGraph

@Composable
fun MainScreen() {
    val appState = rememberJetsnackAppState()

    Scaffold(
        bottomBar = {
            if (appState.shouldShowBottomBar) {
                BottomBar(navController = appState.navController)
            }
        },
        scaffoldState = appState.scaffoldState
    ) { padding ->
        BottomNavGraph(
            navController = appState.navController, modifier = Modifier
                .padding(padding)
        )
    }
}