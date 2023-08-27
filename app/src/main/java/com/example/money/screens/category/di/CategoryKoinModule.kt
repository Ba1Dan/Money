package com.example.money.screens.category.di

import com.example.money.screens.category.data.CategoryRepositoryImpl
import com.example.money.screens.category.domain.repository.CategoryRepository
import com.example.money.screens.category.presentation.CategoryViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val categoryKoinModule = module {
    single<CategoryRepository> { CategoryRepositoryImpl() }
    viewModelOf(::CategoryViewModel)
}