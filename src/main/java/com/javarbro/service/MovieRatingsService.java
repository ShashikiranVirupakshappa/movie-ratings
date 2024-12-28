package com.javarbro.service;

import com.javarbro.dto.MovieRatings;
import com.javarbro.repository.MovieRatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingsService {


    @Autowired
    private MovieRatingsRepository movieRatingsRepository;

    public MovieRatings getMovieRatings( Long movieId,  String userId) {
        com.javarbro.model.MovieRatings movieRatingsByUserIdAndMovieId = movieRatingsRepository.findByUserIdAndMovieId(userId, movieId).orElseThrow(() -> new RuntimeException("no movieratings found for provided criteria"));
        return new MovieRatings(movieRatingsByUserIdAndMovieId.getId(), movieRatingsByUserIdAndMovieId.getUserId(), movieRatingsByUserIdAndMovieId.getMovieId(), movieRatingsByUserIdAndMovieId.getRatings());
    }

    public List<MovieRatings> getAllMoviesRatings() {
        return movieRatingsRepository.findAll().stream().map(movieRatings -> new MovieRatings(movieRatings.getId(), movieRatings.getUserId(), movieRatings.getMovieId(), movieRatings.getRatings())).toList();
    }

    public List<MovieRatings> getAllMoviesRatings( String userId) {
        return movieRatingsRepository.findByUserId(userId).stream().map(movieRatings -> new MovieRatings(movieRatings.getId(), movieRatings.getUserId(), movieRatings.getMovieId(), movieRatings.getRatings())).toList();
    }

    public MovieRatings saveMovieRating( MovieRatings movieRatings){
        com.javarbro.model.MovieRatings ratings = new com.javarbro.model.MovieRatings();
        ratings.setUserId(movieRatings.getUserId());
        ratings.setMovieId(movieRatings.getMovieId());
        ratings.setRatings(movieRatings.getRating());
        com.javarbro.model.MovieRatings movieRatings1 = movieRatingsRepository.save(ratings);
        movieRatings.setId(movieRatings1.getId());
        return movieRatings;
    }

    public MovieRatings updateMovieRatings( MovieRatings movieRatings,  String userId,  Long movieId) {
        MovieRatings movieRatings3 = getMovieRatings(movieId, userId);
        if(movieRatings3!=null) {
            com.javarbro.model.MovieRatings ratings = new com.javarbro.model.MovieRatings();
            ratings.setUserId(movieRatings3.getUserId());
            ratings.setMovieId(movieRatings3.getMovieId());
            ratings.setRatings(movieRatings.getRating());
            ratings.setId(movieRatings3.getId());
            com.javarbro.model.MovieRatings movieRatings1 = movieRatingsRepository.save(ratings);
            movieRatings.setId(movieRatings1.getId());
        }
        return movieRatings;
    }

    public void deleteMovieRatings( String userId, Long movieId){
        MovieRatings movieRatings3 = getMovieRatings(movieId, userId);
        if(movieRatings3!=null) {
            com.javarbro.model.MovieRatings ratings = new com.javarbro.model.MovieRatings();
            ratings.setUserId(movieRatings3.getUserId());
            ratings.setMovieId(movieRatings3.getMovieId());
            ratings.setRatings(movieRatings3.getRating());
            ratings.setId(movieRatings3.getId());
            movieRatingsRepository.delete(ratings);
        }
    }
}
