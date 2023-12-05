package com.ficohsa.movies.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {
    private String name;
    private String overview;
    private boolean status;
    private String image;
    private String genres;
    private String author;


}
