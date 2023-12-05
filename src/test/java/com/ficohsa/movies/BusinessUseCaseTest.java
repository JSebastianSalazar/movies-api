package com.ficohsa.movies;

import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.dto.MoviesResponse;
import com.ficohsa.movies.domain.model.Movie;
import com.ficohsa.movies.domain.service.BusinessUseCase;
import com.ficohsa.movies.intraestructure.adapter.persistence.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BusinessUseCaseTest {

    @Autowired
    private BusinessUseCase businessUseCase;

    @MockBean
    private MovieRepository movieRepository;

    @BeforeEach
    void setUp() {
    List<MoviesResponse> moviesResponses = List.of(new MoviesResponse());
        when(movieRepository.findByName(anyString())).thenReturn(moviesResponses);

        Movie movie = new Movie();
        when(movieRepository.findById(anyLong())).thenReturn(Optional.of(movie));
    }

    @Test
    void testFindByname() {
        String name = "Test Movie";
        List<MoviesResponse> moviesResponses = businessUseCase.findByname(name);
        assertNotNull(moviesResponses);

    }

    @Test
    void testFindById() {
        Long id = 1L;
        MovieResponse movieResponse = businessUseCase.findById(id);
        assertNotNull(movieResponse);

    }
}
