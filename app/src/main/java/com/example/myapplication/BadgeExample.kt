package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BadgeExample(modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
        Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
            Badge(
                modifier = Modifier.padding(18.dp),
            )
            Badge(
                content = {
                    Text("Badge")
                },
            )
        }
        BadgedBox(
            modifier = modifier.padding(24.dp), // Add padding to the BadgedBox
            badge = {
                Badge {
                    Text("1")
                }
            }
        ) {
            Icon(
                Icons.Default.Notifications,
                contentDescription = null,

                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBadgeExample() {
    BadgeExample()
}