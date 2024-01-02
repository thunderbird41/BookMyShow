package com.example.bookmyshow.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(Long id) {
        super("Customer By id: " + id + " not found.");
    }
}
