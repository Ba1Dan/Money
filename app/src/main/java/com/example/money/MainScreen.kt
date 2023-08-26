package com.example.money

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.money.navigation.BottomBar
import com.example.money.navigation.BottomNavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) { padding ->
        BottomNavGraph(navController = navController,  modifier = Modifier
            .padding(padding))
    }
}