package com.example.bookmyshow.exceptions;

public class InvalidCustomerException extends RuntimeException {
    public InvalidCustomerException(){
        super("Email is mandatory and cannot be null.");
    }
}
