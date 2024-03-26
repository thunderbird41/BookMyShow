package com.example.bookmyshow.repository;


import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByHall(Hall hall);
}
