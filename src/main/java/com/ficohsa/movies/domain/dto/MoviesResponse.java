package com.ficohsa.movies.domain.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoviesResponse {


    private Long id;
    private String name;
    private boolean status;
    private String image;
    private String author;


}
