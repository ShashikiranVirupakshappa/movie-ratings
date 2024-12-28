package com.javarbro.controllers;

import com.javarbro.dto.MovieRatings;
import com.javarbro.service.MovieRatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movieRatings")
public class MovieRatingsController {

    @Autowired
    private MovieRatingsService movieRatingsService;

    @GetMapping("{userId}/{movieId}")
    public MovieRatings getMovieRatings(@PathVariable Long movieId, @PathVariable String userId) {
        return movieRatingsService.getMovieRatings(movieId, userId);
    }

    @GetMapping
    public List<MovieRatings> getAllMoviesRatings() {
        return movieRatingsService.getAllMoviesRatings();
    }

    @GetMapping("{userId}")
    public List<MovieRatings> getAllMoviesRatings(@PathVariable String userId) {
        return movieRatingsService.getAllMoviesRatings(userId);
    }

    @PostMapping
    public MovieRatings saveMovieRating(@RequestBody MovieRatings movieRatings){
        return movieRatingsService.saveMovieRating(movieRatings);
    }

    @PutMapping("{userId}/{movieId}")
    public MovieRatings updateMovieRatings(@RequestBody MovieRatings movieRatings, @PathVariable String userId, @PathVariable Long movieId) {
        return movieRatingsService.updateMovieRatings(movieRatings, userId, movieId);
    }

    @DeleteMapping("{userId}/{movieId}")
    public void deleteMovieRatings(@PathVariable String userId, @PathVariable Long movieId){
        movieRatingsService.deleteMovieRatings(userId, movieId);
    }
}