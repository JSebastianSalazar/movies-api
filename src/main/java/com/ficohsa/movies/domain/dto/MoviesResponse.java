package com.ficohsa.movies.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoviesResponse {


    private Long id;
    private String name;
    private boolean status;
    private String image;


}
