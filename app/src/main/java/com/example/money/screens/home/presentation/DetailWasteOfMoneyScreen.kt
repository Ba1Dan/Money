package com.example.money.screens.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DetailWasteOfMoneyScreen(
    onBackClick: () -> Unit,
    onNavigateCategory: (categoryId: Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopAppBar(
            title = { Text("Новая транзакция") },
            backgroundColor = MaterialTheme.colors.primary,
            navigationIcon = {
                IconButton(
                    onClick = {
                        onBackClick.invoke()
                    }
                ) {
                    Icon(Icons.Filled.ArrowBack, "backIcon")
                }
            },
            actions = {
                IconButton(onClick = {

                }) {
                    Icon(Icons.Filled.Check, contentDescription = null)
                }
            }
        )
        InputTransactionView()
        ChooseCategoryView(onNavigateCategory = onNavigateCategory)
        ChooseDateView()
    }
}

@Composable
fun InputTransactionView() {
    val message = remember { mutableStateOf("") }

    TextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = message.value,
        onValueChange = { message.value = it },
        maxLines = 1,
        trailingIcon = {
            Icon(Icons.Outlined.PlayArrow, contentDescription = null)
        }
    )
}

@Composable
fun ChooseDateView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Вчера",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .weight(1f)
        )

        Text(
            text = "Сегодня",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .weight(1f)
        )
        Text(
            text = "Другое",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(vertical = 16.dp)
                .weight(1f)
        )
    }
}


@Preview
@Composable
fun DetailWasteOfMoneyScreenPreview() {
    DetailWasteOfMoneyScreen(onBackClick = {}, onNavigateCategory = {})
}