package com.example.money.screens.home.presentation

import com.example.money.screens.home.domain.WasteOfMoney

sealed class HomeUiState {

    object Loading : HomeUiState()

    class Content(val items: List<WasteOfMoney>) : HomeUiState()

    object Empty : HomeUiState()
}