package com.example.money.screens.category.domain.repository

import com.example.money.screens.category.domain.model.CategoryModel

interface CategoryRepository {

    suspend fun getCategories(): List<CategoryModel>

}