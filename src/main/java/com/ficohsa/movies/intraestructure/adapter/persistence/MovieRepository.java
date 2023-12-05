package com.ficohsa.movies.intraestructure.adapter.persistence;

import com.ficohsa.movies.domain.dto.MoviesResponse;
import com.ficohsa.movies.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT new com.ficohsa.movies.domain.dto.MoviesResponse(m.id, m.name, m.status, m.image)  FROM Movie m WHERE m.name LIKE %:name%")
    List<MoviesResponse> findByName(@Param("name") String name);
}
