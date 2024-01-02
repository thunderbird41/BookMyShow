package com.example.bookmyshow.repository;

import com.example.bookmyshow.models.Movie;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Id> {
    Optional<Movie> findMovieByName(String name);

    Optional<Object> findById(Long id);
}
