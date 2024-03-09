package com.example.money.screens.category.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.money.screens.category.domain.model.CategoryModel

@Composable
fun CategoryItemView(
    item: CategoryItem,
    onCheckedChange: (item: CategoryItem, checked: Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = item.categoryModel.icon,
            contentDescription = "icon category"
        )
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            text = item.categoryModel.title
        )
        Checkbox(
            checked = item.isSelected,
            onCheckedChange = {
                onCheckedChange.invoke(item, it)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryItemViewPreview() {
    CategoryItemView(
        item = CategoryItem(
            categoryModel = CategoryModel(
                id = 0,
                icon = Icons.Default.Add,
                title = "Автомобиль"
            ),
            isSelected = true
        )
    ) { item: CategoryItem, checked: Boolean ->
    }
}