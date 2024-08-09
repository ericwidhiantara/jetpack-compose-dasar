package com.example.myapplication

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LeadingIconExample(modifier: Modifier = Modifier) {
    val currentIndex = remember {
        mutableIntStateOf(0)
    }
    TabRow(
        selectedTabIndex = currentIndex.intValue,
        modifier = modifier,
    ) {
        LeadingIconTab(
            selected = currentIndex.intValue == 0,
            onClick = { currentIndex.intValue = 0 },
            text = {
                Text("Home")
            },
            icon = {
                Icon(Icons.Default.Home, contentDescription = null)
            }
        )
        LeadingIconTab(
            selected = currentIndex.intValue == 1,
            onClick = { currentIndex.intValue = 1 },
            text = {
                Text("Favorite")
            },
            icon = {
                Icon(Icons.Default.Favorite, contentDescription = null)
            }
        )
        LeadingIconTab(
            selected = currentIndex.intValue == 2,
            onClick = { currentIndex.intValue = 2 },
            text = {
                Text("Settings")
            },
            icon = {
                Icon(Icons.Default.Settings, contentDescription = null)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLeadingIconExample() {
    LeadingIconExample()
}