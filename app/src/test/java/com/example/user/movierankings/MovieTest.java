package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("The Shawshank Redemption", "Drama");
    }

    @Test
    public void testMovieTitle(){
        assertEquals("The Shawshank Redemption", movie.getTitle());
    }

    @Test
    public void testMovieGenre(){
        assertEquals("Drama", movie.getMovieGenre());
    }

}
