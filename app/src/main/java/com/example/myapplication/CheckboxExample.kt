package com.example.myapplication

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckboxExample(modifier: Modifier = Modifier) {
    val rememberMe = remember {
        mutableStateOf(false)
    }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = rememberMe.value, onCheckedChange = {
            rememberMe.value = it
        })
        Text("Ingat saya?")
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewCheckboxExample() {
    CheckboxExample()
}