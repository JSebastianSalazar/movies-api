package com.ficohsa.movies.application.input;

import com.ficohsa.movies.domain.dto.MovieResponse;
import com.ficohsa.movies.domain.dto.MoviesResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface MoviesPort {

  @Operation(
      operationId = "find By name",
      summary = "Find all movies acording by name",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = {
              @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = List.class))
            }),
        @ApiResponse(
            responseCode = "400",
            description = "bad request",
            content = {@Content(mediaType = "application/json")}),
        @ApiResponse(
            responseCode = "404",
            description = "Not found",
            content = {@Content(mediaType = "application/json")}),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error",
            content = {@Content(mediaType = "application/json")})
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/movies/v1",
      produces = {"application/json"})
  default ResponseEntity<List<MoviesResponse>> findByName(
      @Parameter(name = "name", description = "", schema = @Schema(description = ""))
          @Valid
          @RequestParam(value = "name", required = false)
          String name) {
    return new ResponseEntity(null, HttpStatus.OK);
  }

  @Operation(
      operationId = "find By id",
      summary = "Find movie by id",
      responses = {
        @ApiResponse(
            responseCode = "200",
            description = "OK",
            content = {
              @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = MovieResponse.class))
            }),
        @ApiResponse(
            responseCode = "400",
            description = "bad request",
            content = {@Content(mediaType = "application/json")}),
        @ApiResponse(
            responseCode = "404",
            description = "Not found",
            content = {@Content(mediaType = "application/json")}),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error",
            content = {@Content(mediaType = "application/json")})
      })
  @RequestMapping(
      method = RequestMethod.GET,
      value = "/movie/v1/{id}",
      produces = {"application/json"})
  default ResponseEntity<MovieResponse> findById(@PathVariable("id") Long id) {
    return new ResponseEntity(null, HttpStatus.OK);
  }
}
