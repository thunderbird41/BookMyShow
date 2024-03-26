package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Seat extends BaseModel{
    private Integer rowNo;
    private Integer colNo;

    @Enumerated
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
}
