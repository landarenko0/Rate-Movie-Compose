package com.example.ratemovie.navigation.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.ratemovie.navigation.AppScreens

@Composable
fun MainNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.StartNavGraph
    ) {
        navigation<AppScreens.StartNavGraph>(
            startDestination = AppScreens.StartScreen
        ) {

        }

        navigation<AppScreens.SearchNavGraph>(
            startDestination = AppScreens.StartScreen
        ) {

        }

        navigation<AppScreens.AccountNavGraph>(
            startDestination = AppScreens.StartScreen
        ) {

        }
    }
}