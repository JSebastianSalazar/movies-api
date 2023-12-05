package com.ficohsa.movies;

import com.ficohsa.movies.domain.exceptions.ErrorHandler;
import com.ficohsa.movies.domain.exceptions.ErrorMessage;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
public class ErrorHandlerTest {

    @InjectMocks
    private ErrorHandler errorHandler;

    @Mock
    private MethodArgumentTypeMismatchException methodArgumentTypeMismatchException;

    @Test
    void testMovieNotFound() {
        String errorMessage = "Movie not found";
        RuntimeException runtimeException = new RuntimeException(errorMessage);

        ErrorMessage result = errorHandler.movieNotFound(runtimeException);

        assertEquals(errorMessage, result.mensaje());
    }

    @Test
    void testBadRequest() {
        String errorMessage = "Not is valid id";
        when(methodArgumentTypeMismatchException.getMessage()).thenReturn(errorMessage);

        ErrorMessage result = errorHandler.badRequest(methodArgumentTypeMismatchException);

        assertEquals(errorMessage, result.mensaje());
    }
}