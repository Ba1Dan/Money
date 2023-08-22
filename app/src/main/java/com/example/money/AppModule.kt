package com.example.money

import com.example.money.screens.home.homeKoinModule
import org.koin.dsl.module

val appModule = module {
    includes(homeKoinModule)
}