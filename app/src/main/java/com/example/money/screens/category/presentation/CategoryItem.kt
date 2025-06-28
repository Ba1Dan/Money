package com.example.money.screens.category.presentation

import com.example.money.screens.category.domain.model.CategoryModel

data class CategoryItem(
    val categoryModel: CategoryModel,
    val isSelected: Boolean
)