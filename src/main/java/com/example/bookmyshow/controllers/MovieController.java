package com.example.bookmyshow.controllers;

import com.example.bookmyshow.DTOs.CreateMovieDTO;
import com.example.bookmyshow.exceptions.MovieNameMandatoryException;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/movie")
public class MovieController {
    MovieService movieService;

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id){
        return movieService.getMovie(id);
    }
    @PostMapping("/create")
    public Movie createMovie(@RequestBody CreateMovieDTO createMovieDTO){
        //validate - movie name mandotary
        validate(createMovieDTO);
        return movieService.createMovie(createMovieDTO);
    }

    private void validate(CreateMovieDTO createMovieDTO) {
        if (createMovieDTO.getName() == null){
            throw new MovieNameMandatoryException();
        }
    }
}
