package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarExample(modifier: Modifier = Modifier) {
    val currentIndex = remember {
        mutableIntStateOf(0)
    }
    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = currentIndex.intValue == 0,
                    onClick = {
                        currentIndex.intValue = 0
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Favorite, contentDescription = "Favorite") },
                    label = { Text("Favorite") },
                    selected = currentIndex.intValue == 1,
                    onClick = {
                        currentIndex.intValue = 1
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Settings, contentDescription = "Settings") },
                    label = { Text("Settings") },
                    selected = currentIndex.intValue == 2,
                    onClick = {
                        currentIndex.intValue = 2
                    }
                )
            }
        },
        floatingActionButton = {
            Icon(Icons.Filled.Add, contentDescription = null)
        },
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            when (currentIndex.intValue) {
                0 -> Text("Home")
                1 -> Text("Favorite")
                2 -> Text("Settings")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomAppBarExample() {
    BottomAppBarExample()
}