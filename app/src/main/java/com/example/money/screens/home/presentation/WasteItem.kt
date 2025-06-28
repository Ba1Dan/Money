package com.example.money.screens.home.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.money.screens.home.domain.WasteOfMoney


@Composable
fun WasteItem(
    item: WasteOfMoney,
    navigateToDetail: (Int) -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable {
                navigateToDetail.invoke(item.id)
            },
    ) {
        Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)) {
            Text(
                text = item.amount.toString(),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = item.typeWaste.name,
                color = Color.Black,
                fontSize = 16.sp,
                modifier = Modifier.padding(vertical = 4.dp)
            )
            Text(
                text = item.createAtDate,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}