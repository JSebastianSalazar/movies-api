package com.ficohsa.movies.domain.service;

import java.util.List;

import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.dto.MoviesResponse;
import com.ficohsa.movies.domain.factory.MovieFactory;
import com.ficohsa.movies.domain.model.Movie;
import com.ficohsa.movies.intraestructure.adapter.persistence.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessUseCase implements MovieFactory {


  @Autowired
  private MovieRepository movieRepository;

  public List<MoviesResponse> findByname(String name) {
    return movieRepository.findByName(name);
  }


  public MovieResponse findById(Long id) {
    Movie movie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found with ID: " + id));
    return buildMovieResponse(movie);
  }

}
