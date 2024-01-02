package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
// returns a builder initialized with the properties on the instance it is called upon

public class Hall extends BaseModel{
    private String name;

    @OneToMany(mappedBy = "hall")
    private List<Seat> seats = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> movieFeatures = new ArrayList<>();
}
