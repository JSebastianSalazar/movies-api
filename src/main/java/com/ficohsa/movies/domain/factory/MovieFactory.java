package com.ficohsa.movies.domain.factory;

import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.model.Movie;
import org.springframework.stereotype.Component;

public interface MovieFactory {

    default MovieResponse buildMovieResponse(Movie movie) {
        return MovieResponse
                .builder()
                .name(movie.getName())
                .author(movie.getAuthor())
                .image(movie.getImage())
                .overview(movie.getOverview())
                .genres(movie.getGenres())
                .build();
    }
}
