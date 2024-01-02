package com.example.bookmyshow.exceptions;

public class MovieNameMandatoryException extends RuntimeException {
    public MovieNameMandatoryException(){
        super("Movie name is mandatory");
    }
}
