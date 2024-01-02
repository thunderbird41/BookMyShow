package com.example.bookmyshow.DTOs;

import com.example.bookmyshow.models.User;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class CustomerDTO {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String city;
    private String username;
    private String password;
}
