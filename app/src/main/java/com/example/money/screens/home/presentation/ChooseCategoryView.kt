package com.example.money.screens.home.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ChooseCategoryView(
    onNavigateCategory: (categoryId: Int) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Доход",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .weight(1f)
        )

        Text(
            text = "Без категории",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .weight(1f)
                .clickable(
                    onClick = {
                        onNavigateCategory.invoke(1)
                    }
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChooseCategoryViewPreview() {
    ChooseCategoryView(onNavigateCategory = {})
}