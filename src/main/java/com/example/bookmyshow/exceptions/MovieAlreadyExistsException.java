package com.example.bookmyshow.exceptions;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String name) {
        super("Movie already exists");
    }
}
