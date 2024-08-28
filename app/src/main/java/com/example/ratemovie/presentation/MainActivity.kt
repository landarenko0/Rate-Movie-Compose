package com.example.ratemovie.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ratemovie.navigation.navgraph.MainNavGraph
import com.example.ratemovie.presentation.ui.theme.RateMovieComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RateMovieComposeTheme {
                MainNavGraph()
            }
        }
    }
}