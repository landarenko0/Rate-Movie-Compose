package com.example.ratemovie.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val ageRating: Int,
    val poster: Poster?,
    val genres: List<Genre>
)