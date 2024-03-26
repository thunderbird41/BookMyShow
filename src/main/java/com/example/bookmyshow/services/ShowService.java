package com.example.bookmyshow.services;

import com.example.bookmyshow.DTOs.CreateShowDTO;
import com.example.bookmyshow.exceptions.NoSuchElementException;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.repository.HallRepository;
import com.example.bookmyshow.repository.MovieRepository;
import com.example.bookmyshow.repository.ShowRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShowService {

    private ShowRepository showRepository;
    private HallRepository hallRepository;
    private MovieRepository movieRepository;
    private SeatService seatService;
    private final ShowSeatRepository showSeatRepository;


    public Show getShow(Long id) {
        return showRepository.findById(id).orElseThrow(() -> new NoSuchElementException(id));
    }

    public Show createShow(CreateShowDTO createShow) {

        return null;
    }
}
