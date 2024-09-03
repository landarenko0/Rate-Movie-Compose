package com.example.ratemovie.presentation.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.ratemovie.domain.models.Genre
import com.example.ratemovie.domain.models.Movie
import com.example.ratemovie.domain.models.Poster

@Composable
fun MovieCard(
    modifier: Modifier = Modifier,
    movie: Movie
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(width = 2.dp, color = Color.Gray),
        onClick = { }
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp),
            model = movie.poster?.url,
            contentDescription = "Movie poster image"
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = movie.title, fontSize = 10.sp)

            Text(text = movie.genres.joinToString { it.name }, fontSize = 8.sp)
        }
    }
}

@Preview
@Composable
private fun MovieCardPreview() {
    MovieCard(
        movie = Movie(
            id = 123,
            title = "Иван Васильевич меняет профессию",
            description = "Описание",
            ageRating = 16,
            poster = Poster(""),
            genres = listOf(Genre("Фантастика"))
        ),
        modifier = Modifier.size(width = 170.dp, height = 300.dp)
    )
}