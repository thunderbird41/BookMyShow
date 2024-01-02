package com.example.bookmyshow.DTOs;

import com.example.bookmyshow.enums.Languages;
import com.example.bookmyshow.enums.MovieFeature;
import com.example.bookmyshow.models.Show;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class CreateMovieDTO {
    private String name;
    private Double rating;

    private List<Languages> languages = new ArrayList<>();

    private List<MovieFeature> movieFeatures = new ArrayList<>();

    // @OneToMany(mappedBy = "movie")
    private List<Show> shows = new ArrayList<>();
}
