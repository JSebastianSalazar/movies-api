package com.ficohsa.movies;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.dto.MoviesResponse;
import com.ficohsa.movies.domain.service.BusinessUseCase;
import com.ficohsa.movies.intraestructure.adapter.input.MoviesAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
class MoviesAdapterTest {

    @Mock
    private BusinessUseCase businessUseCase;

    @InjectMocks
    private MoviesAdapter moviesAdapter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindByName() {
        String name = "Test Movie";
        List<MoviesResponse> moviesResponses = Arrays.asList(new MoviesResponse(/*...*/));

        // Mock the behavior of businessUseCase.findByname
        when(businessUseCase.findByname(name)).thenReturn(moviesResponses);

        // Call the method under test
        ResponseEntity<List<MoviesResponse>> responseEntity = moviesAdapter.findByName(name);

        // Verify that the businessUseCase method was called with the correct argument
        verify(businessUseCase).findByname(name);

        // Assert the expected result
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(moviesResponses, responseEntity.getBody());
    }

    @Test
    void testFindById() {
        Long id = 1L;
        MovieResponse movieResponse = new MovieResponse(/*...*/);

        // Mock the behavior of businessUseCase.findById
        when(businessUseCase.findById(id)).thenReturn(movieResponse);

        // Call the method under test
        ResponseEntity<MovieResponse> responseEntity = moviesAdapter.findById(id);

        // Verify that the businessUseCase method was called with the correct argument
        verify(businessUseCase).findById(id);

        // Assert the expected result
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(movieResponse, responseEntity.getBody());
    }
}