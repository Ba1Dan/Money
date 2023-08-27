package com.example.money

import com.example.money.screens.category.di.categoryKoinModule
import com.example.money.screens.home.di.homeKoinModule
import org.koin.dsl.module

val appModule = module {
    includes(homeKoinModule)
    includes(categoryKoinModule)
}