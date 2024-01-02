package com.example.bookmyshow.exceptions;

import org.apache.el.util.ReflectionUtil;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long id) {
        super("Movie with id: " + id + " not found.");
    }
}
