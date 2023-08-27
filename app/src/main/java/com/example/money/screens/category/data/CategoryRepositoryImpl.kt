package com.example.money.screens.category.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import com.example.money.screens.category.domain.model.CategoryModel
import com.example.money.screens.category.domain.repository.CategoryRepository
import kotlinx.coroutines.delay

class CategoryRepositoryImpl : CategoryRepository {

    private val categories = mutableListOf<CategoryModel>(
        CategoryModel(
            id = 0,
            icon = Icons.Outlined.ShoppingCart,
            title = "Магазин"
        ),
        CategoryModel(
            id = 1,
            icon = Icons.Outlined.Call,
            title = "Звонок"
        ),
        CategoryModel(
            id = 2,
            icon = Icons.Outlined.Email,
            title = "Почта"
        ),
        CategoryModel(
            id = 3,
            icon = Icons.Outlined.Place,
            title = "Место"
        ),
        CategoryModel(
            id = 4,
            icon = Icons.Outlined.Refresh,
            title = "Обновление"
        ),
        CategoryModel(
            id = 5,
            icon = Icons.Outlined.Search,
            title = "Поиск"
        )
    )

    override suspend fun getCategories(): List<CategoryModel> {
        delay(2000)
        return categories
    }
}