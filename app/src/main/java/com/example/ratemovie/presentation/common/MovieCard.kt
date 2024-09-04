package com.example.ratemovie.presentation.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale
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
    val locale = Locale.current
    
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(width = 1.dp, color = Color.Gray),
        onClick = { }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
            ) {
                AsyncImage(
                    modifier = Modifier.fillMaxSize(),
                    model = movie.poster?.url,
                    contentDescription = "Movie poster image"
                )

                AgeLimitCard(
                    age = movie.ageRating,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(24.dp)
                )
            }

            Text(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                text = movie.title,
                fontSize = 10.sp
            )

            Text(
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
                text = movie.genres.joinToString { it.name }.capitalize(locale),
                fontSize = 8.sp
            )
        }
    }
}

@Composable
fun AgeLimitCard(
    modifier: Modifier = Modifier,
    age: Int
) {
    Box(
        modifier = modifier.background(
            color = Color(color = 0xFF191926),
            shape = RoundedCornerShape(4.dp)
        ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$age+",
            fontSize = 12.sp,
            color = Color.White
        )
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
            ageRating = 6,
            poster = Poster(""),
            genres = listOf(Genre("комедия"), Genre("фантастика"), Genre("приключения"))
        ),
        modifier = Modifier.size(width = 170.dp, height = 300.dp)
    )
}

@Preview
@Composable
private fun AgeLimitCardPreview() {
    AgeLimitCard(
        modifier = Modifier.size(24.dp),
        age = 16
    )
}