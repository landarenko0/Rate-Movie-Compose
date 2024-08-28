package com.example.ratemovie.navigation

import kotlinx.serialization.Serializable

sealed class AppScreens {

    @Serializable
    object StartNavGraph

    @Serializable
    object SearchNavGraph

    @Serializable
    object AccountNavGraph

    @Serializable
    object StartScreen

    @Serializable
    object SearchScreen

    @Serializable
    object AccountScreen

    @Serializable
    object MovieDetailsScreen

    @Serializable
    object LoginScreen

    @Serializable
    object RegistrationScreen
}