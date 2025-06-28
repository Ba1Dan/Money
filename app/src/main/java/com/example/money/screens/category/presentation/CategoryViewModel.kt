package com.example.money.screens.category.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.money.core.LoadableData
import com.example.money.screens.category.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CategoryViewModel(
    private val categoryRepository: CategoryRepository
) : ViewModel() {

    private val _categoryState: MutableStateFlow<CategoryUiState> =
        MutableStateFlow(CategoryUiState(categories = LoadableData.Initial))

    val categoryUiState: StateFlow<CategoryUiState> = _categoryState

    init {
        viewModelScope.launch {
            _categoryState.emit(CategoryUiState(categories = LoadableData.Loading))
            val categories = categoryRepository.getCategories().map {
                CategoryItem(
                    categoryModel = it,
                    isSelected = false
                )
            }
            _categoryState.emit(CategoryUiState(LoadableData.Content(value = categories)))
        }
    }

    fun onCheckedChange(item: CategoryItem, checked: Boolean) {
        viewModelScope.launch {
            val state = categoryUiState.value.categories
            if (state is LoadableData.Content) {
                val categories = state.value
                val updatedItems = categories.map {
                    if (it.categoryModel.id == item.categoryModel.id) {
                        it.copy(isSelected = true)
                    } else {
                        it.copy(isSelected = false)
                    }
                }
                _categoryState.emit(CategoryUiState(LoadableData.Content(value = updatedItems)))
            }
        }
    }
}