package com.example.money.screens.home.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.money.screens.home.presentation.HomeUiState
import com.example.money.screens.home.presentation.HomeViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel(),
) {
    val homeUiState: HomeUiState by viewModel.homeScreenState.collectAsStateWithLifecycle()

    when(homeUiState) {
        is HomeUiState.Content -> {
            val items = (homeUiState as HomeUiState.Content).items
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(items, itemContent = {
                    Card(modifier = Modifier.fillMaxWidth()) {

                    }
                })
            }

        }
        is HomeUiState.Empty -> {

        }
        is HomeUiState.Loading -> {

        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}