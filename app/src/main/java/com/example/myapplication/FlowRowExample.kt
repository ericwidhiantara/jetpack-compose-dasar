package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowExample(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.Center,
        maxItemsInEachRow = 3,
    ) {
        repeat(10) { index ->
            Button(
                onClick = {},
                modifier = Modifier
                    .background(Color.Red)
                    .padding(16.dp),
            ) {
                Text(
                    text = "Index $index",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )

            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewFlowRowExample() {
    FlowRowExample()
}