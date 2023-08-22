package com.example.money.screens.home.data

import com.example.money.screens.home.domain.TypeWaste
import com.example.money.screens.home.domain.WasteOfMoney
import com.example.money.screens.home.domain.HistoryMoneyRepository
import kotlinx.coroutines.delay

class HistoryMoneyRepositoryImpl : HistoryMoneyRepository {

    private val history = mutableListOf(
        WasteOfMoney(
            id = 0,
            amount = 5000,
            createAtDate = "11 August 2022",
            typeWaste = TypeWaste.SHOP
        ),
        WasteOfMoney(
            id = 1,
            amount = 4000,
            createAtDate = "5 August 2022",
            typeWaste = TypeWaste.SHOP
        ),
        WasteOfMoney(
            id = 2,
            amount = 500,
            createAtDate = "3 July 2022",
            typeWaste = TypeWaste.SHOP
        ),
        WasteOfMoney(
            id = 3,
            amount = 5000,
            createAtDate = "29 September 2022",
            typeWaste = TypeWaste.SHOP
        ),
    )

    override suspend fun getHistory(): List<WasteOfMoney> {
        delay(5000)
        return history
    }
}