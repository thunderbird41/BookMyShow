package com.example.bookmyshow.exceptions;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(Long id) {
        super("No such element exists");
    }
}
