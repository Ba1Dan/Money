package com.example.money.screens.home

import com.example.money.screens.home.data.HistoryMoneyRepositoryImpl
import com.example.money.screens.home.domain.HistoryMoneyRepository
import com.example.money.screens.home.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val homeKoinModule = module {
    single<HistoryMoneyRepository> { HistoryMoneyRepositoryImpl() }
    viewModelOf(::HomeViewModel)
}