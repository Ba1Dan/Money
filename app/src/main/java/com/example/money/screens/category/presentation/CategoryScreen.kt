package com.example.money.screens.category.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.money.core.LoadableData
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(
    onBackClick: () -> Unit,
    categoryViewModel: CategoryViewModel = koinViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopAppBar(
            title = { Text("Выбор категории") },
            navigationIcon = {
                IconButton(
                    onClick = {
                        onBackClick.invoke()
                    }
                ) {
                    Icon(Icons.Filled.ArrowBack, "backIcon")
                }
            }
        )
        val state: CategoryUiState by categoryViewModel.categoryUiState.collectAsStateWithLifecycle()
        when (val categories = state.categories) {
            is LoadableData.Loading,
            is LoadableData.Initial -> {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            }

            is LoadableData.Content -> {
                CategoryContent(
                    categoryItemList = categories.value,
                    onCheckedChange = { item: CategoryItem, checked: Boolean ->
                        categoryViewModel.onCheckedChange(item, checked)
                    }
                )
            }

            is LoadableData.Error -> {

            }
        }
    }
}

@Composable
fun CategoryContent(
    categoryItemList: List<CategoryItem>,
    onCheckedChange: (item: CategoryItem, checked: Boolean) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(categoryItemList, itemContent = { item ->
            CategoryItemView(
                item = item,
                onCheckedChange = onCheckedChange
            )
        })
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    CategoryScreen(onBackClick = {})
}