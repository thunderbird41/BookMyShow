package com.example.bookmyshow.services;

import com.example.bookmyshow.DTOs.CreateShowDTO;
import com.example.bookmyshow.exceptions.NoSuchElementException;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.repository.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShowService {

    ShowRepository showRepository;
    public Show getShow(Long id) {
        return showRepository.findById(id).orElseThrow(() -> new NoSuchElementException(id));
    }

    public Show createShow(CreateShowDTO createShow) {
        return null;
    }
}
