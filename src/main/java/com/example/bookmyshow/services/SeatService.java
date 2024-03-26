package com.example.bookmyshow.services;

import com.example.bookmyshow.enums.SeatType;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.models.Seat;
import com.example.bookmyshow.repository.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class SeatService {
    SeatRepository seatRepository;
    List<Seat> seats = new ArrayList<>();

    public List<Seat> getSeats(Hall hall){
        // Fetch seats from the database
        createSeats(hall);
        return seatRepository.findByHall(hall);
    }
    public void createSeats(Hall hall) {
        for(int i=1; i<=12; i++){
            if(i <= 3){
                Integer row = 1;
                SeatType type = SeatType.SILVER;
                seatRepository.save(new Seat(row, i, type, hall));
            }
            if(i > 3 && i <= 6){
                Integer row = 2;
                SeatType type = SeatType.GOLD;
                seatRepository.save(new Seat(row, i, type, hall));
            }
            if(i > 6 && i <= 9){
                Integer row = 3;
                SeatType type = SeatType.PLATINUM;
                seatRepository.save(new Seat(row, i, type, hall));
            }
            if (i > 9){
                Integer row = 4;
                SeatType type = SeatType.VIP;
                seatRepository.save(new Seat(row, i, type, hall));
            }
        }
    }
}
