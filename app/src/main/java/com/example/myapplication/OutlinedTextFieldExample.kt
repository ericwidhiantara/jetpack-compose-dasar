package com.example.myapplication

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldExample(modifier: Modifier = Modifier) {
    // State for TextField this kinda like Controller in Flutter
    val text =
        remember { mutableStateOf("") }
    OutlinedTextField(
        value = text.value,
        onValueChange = { newText ->
            text.value = newText

            Log.d("TextField", "Text: $text")
        },
        modifier = modifier.padding(16.dp),
        enabled = true,
        readOnly = false,
        textStyle = MaterialTheme.typography.bodyMedium,
        label = { Text("Enter your name") },
        placeholder = {
            Text("Ini Placeholder")
        },
        leadingIcon =
        {
            Icon(Icons.Default.LocationOn, contentDescription = null)
        },
        trailingIcon = {
            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
        },
        supportingText = {
            Text("Subtitle")
        },
        isError = false,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,
            keyboardType = KeyboardType.Text,
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                // Do something
            }
        ),
    )

}

@Preview(showBackground = true)
@Composable
fun PreviewOutlinedTextFieldExample() {
    OutlinedTextFieldExample()
}
