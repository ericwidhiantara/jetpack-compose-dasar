package com.example.myapplication

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        reverseLayout = true,
        state = rememberLazyListState()
    ) {
        items(100) { index ->
            Text(text = "Ini index ke $index")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLazyColumnExample() {
    LazyColumnExample()
}
