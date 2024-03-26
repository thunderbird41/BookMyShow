package com.example.bookmyshow.DTOs;

import com.example.bookmyshow.enums.MovieFeature;
import com.example.bookmyshow.models.Seat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CreateHallDTO {
    String name;
    List<Seat> seats;
    List<MovieFeature> movieFeatures;
}
