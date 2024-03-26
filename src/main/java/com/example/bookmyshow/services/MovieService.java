package com.example.bookmyshow.services;

import com.example.bookmyshow.DTOs.CreateMovieDTO;
import com.example.bookmyshow.exceptions.MovieAlreadyExistsException;
import com.example.bookmyshow.exceptions.MovieNotFoundException;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    MovieRepository movieRepository;
    public Movie createMovie(CreateMovieDTO createMovieDTO) {
        //validate if movie already exists
        validate(createMovieDTO);
        Movie movie = Movie.builder()
                .name(createMovieDTO.getName())
                .rating(createMovieDTO.getRating())
                .movieFeatures(createMovieDTO.getMovieFeatures())
                .languages(createMovieDTO.getLanguages())
                .build();
        return movieRepository.save(movie);
    }

    private void validate(CreateMovieDTO createMovieDTO) {
        Optional<Movie> checkMovie = movieRepository.findMovieByName(createMovieDTO.getName());
        if (checkMovie.isPresent()){
            throw new MovieAlreadyExistsException(createMovieDTO.getName());
        }
    }

    public Movie getMovie(Long id) {
        return (Movie) movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
    }
}
