package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextFieldExample(modifier)
        TextExample(modifier, "Hello Jetpack Compose")
        ClickableTextExample(
            modifier = modifier,
            text = "Click me",
        )
        InlineContentTextExample(modifier)

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColumnExample() {
    ColumnExample()
}