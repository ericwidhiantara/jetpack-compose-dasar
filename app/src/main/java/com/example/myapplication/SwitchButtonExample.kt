package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SwitchButtonExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
    ) {
        Switch(checked = true, onCheckedChange = {}, thumbContent = {
            Icon(Icons.Default.Star, contentDescription = null)
        })
        Switch(checked = false, onCheckedChange = {})
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSwitchButtonExample() {
    SwitchButtonExample()
}