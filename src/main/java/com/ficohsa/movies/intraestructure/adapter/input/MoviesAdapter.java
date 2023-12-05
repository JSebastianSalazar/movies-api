package com.ficohsa.movies.intraestructure.adapter.input;

import com.ficohsa.movies.application.input.MoviesPort;
import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.dto.MoviesResponse;
import com.ficohsa.movies.domain.service.BusinessUseCase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesAdapter implements MoviesPort {

  @Autowired
  private BusinessUseCase businessUseCase;

  @Override
  public ResponseEntity<List<MoviesResponse>> findByName(String name) {
    return new ResponseEntity(
            businessUseCase.findByname(name), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<MovieResponse> findById(Long id) {
    return new ResponseEntity(
            businessUseCase.findById(id), HttpStatus.OK);
  }
}
