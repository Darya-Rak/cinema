package ru.netology.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

    public class MovieItem {
        private int movieId;
        private String movieName;
        private String genre;

    public int getMovieId() {
        return movieId;
    }
}

