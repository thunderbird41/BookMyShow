package com.example.bookmyshow.models;

import com.example.bookmyshow.enums.PaymentMethod;
import com.example.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Payments extends BaseModel{
    private String reference;
    private Double amount;

    @Enumerated
    private PaymentStatus paymentStatus;
    @Enumerated
    private PaymentMethod paymentMethod;
}
