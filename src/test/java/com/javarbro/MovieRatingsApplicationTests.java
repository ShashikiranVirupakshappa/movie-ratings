package com.javarbro;

import com.javarbro.dto.MovieRatings;
import com.javarbro.repository.MovieRatingsRepository;
import com.javarbro.service.MovieRatingsService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class MovieRatingsApplicationTests {

	/*@Test
	void contextLoads() {
	}
	@Autowired
	private MovieRatingsService movieRatingsService;


	protected void setUp() {
		System.out.println("setup called");
	}
	/*@MockBean
	private MovieRatingsRepository movieRatingsRepository;

	@Test
	public void getAllMovieRatingsSizeCompareToCorrect() {
		List<MovieRatings> movieRatingsList = movieRatingsService.getAllMoviesRatings();
		//Assert.assertEquals(2, movieRatingsList.size()); or
		Assert.assertTrue(movieRatingsService.getAllMoviesRatings().size() == 6);
	}



	@Test
	public void getAllMovieRatingsSizeCompareToInCorrect() {
		Assert.assertFalse(movieRatingsService.getAllMoviesRatings().size() == 1);
	}

	@Test
	public void getAllMovieRatingsDataCompareUsingAssert() {
		List<MovieRatings> movieRatingsList = movieRatingsService.getAllMoviesRatings();
		Assertions.assertArrayEquals(new MovieRatings[] {new MovieRatings(2L,"shashi",600L, 3),
				new MovieRatings(3L, "raj", 100L, 4),
				new MovieRatings(52L, "deepika", 200L, 1),
				new MovieRatings(102L, "deepthi", 300L, 3),
				new MovieRatings(152L, "deepika", 200L, 1),
				new MovieRatings(153L, "deepthi", 300L, 3)}, movieRatingsService.getAllMoviesRatings().toArray());
		//Assert.assertTrue(Arrays.equals(movieRatings.toArray(), movieRatingsService.getAllMoviesRatings().toArray()));
	}

	/*@Test
	public void saveMovieRatingsIdNotNull() {
		MovieRatings movieRatings1 = new MovieRatings();
		movieRatings1.setUserId("deepika");
		movieRatings1.setMovieId(200L);
		movieRatings1.setRating(1);
		MovieRatings movieRatings2 = movieRatingsService.saveMovieRating(movieRatings1);
		Assertions.assertNotNull(movieRatings2.getId());
	}

	@Test
	public void saveMovieRatingsIdNull() {
		MovieRatings movieRatings1 = new MovieRatings();
		movieRatings1.setUserId("deepthi");
		movieRatings1.setMovieId(300L);
		movieRatings1.setRating(3);
		MovieRatings movieRatings2 = movieRatingsService.saveMovieRating(movieRatings1);
		Assertions.assertNull(movieRatings2.getId());
	}*/
}
