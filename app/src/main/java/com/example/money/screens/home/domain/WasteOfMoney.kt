package com.example.money.screens.home.domain

data class WasteOfMoney(
    val id: Int,
    val amount: Long,
    val createAtDate: String,
    val typeWaste: TypeWaste,
    )