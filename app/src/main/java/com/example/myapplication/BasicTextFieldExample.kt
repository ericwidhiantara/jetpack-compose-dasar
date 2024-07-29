package com.example.myapplication

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.format.TextStyle

@Composable
fun BasicTextFieldExample(modifier: Modifier = Modifier) {
    // State for TextField this kinda like Controller in Flutter
    val text =
        remember { mutableStateOf("") }
    BasicTextField(
        value = TextFieldValue(text.value),
        onValueChange={},
    modifier = modifier,
    enabled  = true,
    readOnly = false,
    textStyle = MaterialTheme.typography.bodyMedium,
    keyboardOptions = KeyboardOptions.Default,
    keyboardActions= KeyboardActions.Default,
    singleLine= false,
    maxLines= Int.MAX_VALUE,
    minLines= 1,
    visualTransformation = VisualTransformation.None,
    onTextLayout={

    })

}

@Preview(showBackground = true)
@Composable
fun PreviewBasicTextFieldExample() {
    BasicTextFieldExample()
}
