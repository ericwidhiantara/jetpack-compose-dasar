package com.example.myapplication

import androidx.compose.material3.Tab
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScrollableTabRowExample(modifier: Modifier = Modifier) {
    val currentIndex = remember {
        mutableIntStateOf(0)
    }
    ScrollableTabRow(
        selectedTabIndex = currentIndex.intValue,
        modifier = modifier,
    ) {
        Tab(selected = currentIndex.intValue == 0,
            onClick = { currentIndex.intValue = 0 }) {
            Text("Tab 1")
        }
        Tab(selected = currentIndex.intValue == 1, onClick = { currentIndex.intValue = 1 }) {
            Text("Tab 2")

        }
        Tab(selected = currentIndex.intValue == 2, onClick = { currentIndex.intValue = 2 }) {
            Text("Tab 3")

        }
        Tab(selected = currentIndex.intValue == 3, onClick = { currentIndex.intValue = 3 }) {
            Text("Tab 4")

        }
        Tab(selected = currentIndex.intValue == 4, onClick = { currentIndex.intValue = 4 }) {
            Text("Tab 5")

        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScrollableTabRowExample() {
    ScrollableTabRowExample()
}