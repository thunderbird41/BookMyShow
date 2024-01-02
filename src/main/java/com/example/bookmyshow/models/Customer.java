package com.example.bookmyshow.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Customer extends BaseModel {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String city;

    @OneToOne
    private User user;
}
