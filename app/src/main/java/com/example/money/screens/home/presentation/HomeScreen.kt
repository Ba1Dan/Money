package com.example.money.screens.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    navigateToDetail: (Int) -> Unit,
    viewModel: HomeViewModel = koinViewModel(),
) {
    val homeUiState: HomeUiState by viewModel.homeScreenState.collectAsStateWithLifecycle()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navigateToDetail.invoke(-1)
                },
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add waste")
            }
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                when (homeUiState) {
                    is HomeUiState.Content -> {
                        HomeContent(
                            navigateToDetail = navigateToDetail,
                            homeUiState = (homeUiState as HomeUiState.Content)
                        )
                    }

                    is HomeUiState.Empty -> {

                    }

                    is HomeUiState.Loading -> {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator()
                        }
                    }
                }
            }
        }
    )
}


@Composable
fun HomeContent(
    navigateToDetail: (Int) -> Unit,
    homeUiState: HomeUiState.Content
) {
    val items = homeUiState.items
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(
            items,
            itemContent = { item ->
                WasteItem(item = item, navigateToDetail = navigateToDetail)
            }
        )
    }
}



