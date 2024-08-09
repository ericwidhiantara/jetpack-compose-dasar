package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerDialogExample(modifier: Modifier = Modifier) {
    val showDatePicker = remember { mutableStateOf(false) }
    val datePickerState =
        rememberDatePickerState(initialSelectedDateMillis = System.currentTimeMillis())

    Button(
        modifier = modifier,
        onClick = { showDatePicker.value = true }) {
        Text(text = "Show Date Picker")
    }

    if (showDatePicker.value) {
        DatePickerDialog(onDismissRequest = {
            showDatePicker.value = false
        }, confirmButton = {
            Button(onClick = {
                showDatePicker.value = false
            }) {
                Text("Confirm")
            }
        }) {
            DatePicker(
                state = datePickerState,
                modifier = Modifier.fillMaxWidth(),
                dateFormatter = remember { DatePickerDefaults.dateFormatter() },
                title = {
                    Text("Select a date", modifier = Modifier.padding(16.dp))
                },
                headline = {
                    Text("Today's date", modifier = Modifier.padding(16.dp))
                },
                showModeToggle = true,
                colors = DatePickerDefaults.colors()
            )
        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun PreviewDatePickerDialogExample() {
    DatePickerDialogExample()
}