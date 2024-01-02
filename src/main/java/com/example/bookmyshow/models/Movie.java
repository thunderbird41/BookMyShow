package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.MovieFeature;
import com.example.bookmyshow.enums.Languages;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Movie extends BaseModel{
    private String name;
    private Double rating;

    @ElementCollection
    @Enumerated
    private List<Languages> languages = new ArrayList<>();

    @OneToMany(mappedBy = "movie")
    private List<Show> shows = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> movieFeatures = new ArrayList<>();

}
