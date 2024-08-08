package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RadioButtonExample(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(selected = true, onClick = { /*TODO*/ })
            Text(text = "Laki-Laki")
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(selected = false, onClick = { /*TODO*/ })
            Text(text = "Perempuan")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewRadioButtonExample() {
    RadioButtonExample()
}