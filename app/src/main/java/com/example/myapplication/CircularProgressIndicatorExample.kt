package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CircularProgressIndicatorExample(
    modifier: Modifier = Modifier
) {
    val isLoading = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = modifier,
            onClick = { isLoading.value = !isLoading.value }) {
            if (isLoading.value) {
                Text("Hide Loading")
            } else {
                Text("Show Loading")
            }
        }

        if (isLoading.value) {
            CircularProgressIndicator(modifier = modifier)

        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewCircularProgressIndicatorExample() {
    CircularProgressIndicatorExample()
}