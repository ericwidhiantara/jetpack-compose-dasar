package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DividerExample(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        HorizontalDivider()
        Row() {
            Text("Hello")
            VerticalDivider()
            Text("World")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDividerExample() {
    DividerExample()
}