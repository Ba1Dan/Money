package com.example.money.screens.category.presentation

import com.example.money.core.LoadableData
import com.example.money.core.isContent

data class CategoryUiState(
    val categories: LoadableData<List<CategoryItem>>
)

fun CategoryUiState.getSelected(): CategoryItem? {
    if (categories.isContent) {
        return (categories as LoadableData.Content).value.firstOrNull { it.isSelected }
    }
    return null
}