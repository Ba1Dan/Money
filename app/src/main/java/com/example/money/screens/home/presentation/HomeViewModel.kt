package com.example.money.screens.home.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.money.screens.home.domain.HistoryMoneyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class HomeViewModel(
    private val repository: HistoryMoneyRepository
) : ViewModel() {

    val homeScreenState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState.Loading)

    init {
        loadHistory()
    }

    private fun loadHistory() {
        viewModelScope.launch {
            try {
                val list = repository.getHistory()
                if (list.isEmpty()) {
                    homeScreenState.emit(HomeUiState.Empty)
                } else {
                    homeScreenState.emit(HomeUiState.Content(items = list))
                }
            } catch (e: Exception) {
                Log.d("TAG", "loadHistory:${e.printStackTrace()}")
            }
        }
    }
}