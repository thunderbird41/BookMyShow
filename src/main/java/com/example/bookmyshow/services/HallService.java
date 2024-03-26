package com.example.bookmyshow.services;

import com.example.bookmyshow.DTOs.CreateHallDTO;
import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.exceptions.NoSuchElementException;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.models.Seat;
import com.example.bookmyshow.repository.HallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HallService {
    HallRepository hallRepository;
    SeatService seatService;
    public Hall getHall(Long id) {
        return (Hall) hallRepository.findById(id).orElseThrow(() -> new NoSuchElementException(id));
    }


    public Hall createHall(CreateHallDTO createHallDTO) {
        Hall hall = Hall.builder()
                .name(createHallDTO.getName())
                .movieFeatures(createHallDTO.getMovieFeatures())
                .build();
        //Hall savedHall = hallRepository.save(hall);
        List<Seat> seats = seatService.getSeats(hall);
        Hall savedHall = Hall.builder()
                .name(createHallDTO.getName())
                .seats(seats)
                .movieFeatures(createHallDTO.getMovieFeatures())
                .build();
        return hallRepository.save(savedHall);
        //return savedHall;
    }
}
