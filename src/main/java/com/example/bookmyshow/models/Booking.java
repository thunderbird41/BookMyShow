package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Builder needs to be added
//Booking is basically a ticket
public class Booking extends BaseModel{

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Show show;

    @ManyToMany
    List<ShowSeat> seats = new ArrayList<>();

    private Double amount;
    private Date bookedAt;

    @Enumerated
    private BookingStatus status;

    @OneToMany
    private List<Payments> payments = new ArrayList<>();

}
