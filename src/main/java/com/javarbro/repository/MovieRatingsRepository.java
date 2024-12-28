package com.javarbro.repository;

import com.javarbro.model.MovieRatings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRatingsRepository extends JpaRepository<MovieRatings, Long> {
    public List<MovieRatings> findByUserId(String userId);
    public Optional<MovieRatings> findByUserIdAndMovieId(String userId, Long movieId);
}
