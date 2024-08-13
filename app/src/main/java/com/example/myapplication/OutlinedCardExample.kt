package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedCardExample(modifier: Modifier = Modifier) {
    OutlinedCard(
        onClick = {},
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = CardDefaults.cardColors(),
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(text = "This is an outlined card", modifier = modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOutlinedCardExample() {
    OutlinedCardExample()
}