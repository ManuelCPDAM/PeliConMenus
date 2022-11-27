package com.example.peliculas

class FilmProvider {
    companion object{
        val filmList = listOf<Film>(
            Film(
                film = "lightyear",
                photo="https://lumiere-a.akamaihd.net/v1/images/image_3f5716f2.jpeg?region=0%2C0%2C540%2C810"
            ),
            Film(
                film = "Padre no hay más que uno 3",
                photo = "https://los40es00.epimg.net/los40/imagenes/2020/07/29/cinetv/1596014274_250605_1596016170_noticia_normal.jpg"
            ),
            Film(
                film = "Halloween",
                photo = "https://media.revistagq.com/photos/5ca5f39127f26451017c9a06/1:1/w_900,h_900,c_limit/historia_michael_myers_2960.jpg"
            ),
            Film(
                film = "Pesadilla antes de navidad",
                photo  ="https://www.lavanguardia.com/files/og_thumbnail/uploads/2020/10/26/5fb288f3705c9.png"
            ),
            Film(
                film = "scream",
                photo = "https://www.clarin.com/img/2022/01/12/scream-5-esta-ne-las___PLgDxKqeH_2000x1500__1.jpg"
            )
        )
    }
}