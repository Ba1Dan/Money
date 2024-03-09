package com.example.money

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.money.navigation.BottomBar
import com.example.money.navigation.BottomNavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomBar(navController = navController)
        },
    ) { padding ->
        BottomNavGraph(
            modifier = Modifier.padding(padding),
            navController = navController,
        )
    }
}