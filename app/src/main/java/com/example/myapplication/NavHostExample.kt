package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@Composable
fun NavHostExample(modifier: Modifier = Modifier) {
    MyApplicationTheme {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") {
                    SplashPage(navController = navController)
                }
                composable("home") {
                    HomePage(navController = navController)
                }
            }
        }
    }
}

@Composable
fun SplashPage(modifier: Modifier = Modifier, navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3.seconds)
        navController.navigate("home")
    }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = null)

    }
}

@Composable
fun HomePage(modifier: Modifier = Modifier, navController: NavController) {
    Column(modifier = modifier) {
        Text(text = "This is Home Page", modifier = Modifier.padding(50.dp))
        Button(onClick = {
            navController.navigate("splash")
        }) {
            Text(text = "Go To Splash Screen")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNavHostExample() {
    NavHostExample()
}