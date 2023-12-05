package com.ficohsa.movies;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MoviesPortIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testFindByName() {
        String name = "Test Movie";
        String url = "/movies/v1?name=" + name;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        assertEquals(200, responseEntity.getStatusCodeValue());
        // Add more assertions based on the expected behavior of your API
    }

    @Test
    void testFindById() {
        Long id = 1L;
        String url = "/movie/v1/" + id;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        assertEquals(200, responseEntity.getStatusCodeValue());
        // Add more assertions based on the expected behavior of your API
    }
}