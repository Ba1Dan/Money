package com.example.money.screens.home.domain

interface HistoryMoneyRepository {

    suspend fun getHistory(): List<WasteOfMoney>

}