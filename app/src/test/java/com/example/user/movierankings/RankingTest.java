package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class RankingTest {

    Movie[] moviesToPassIn;
    Movie movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10;

    @Before
    public void before(){
        movie1 = new Movie("The Shawshank Redemption", "Drama", 1);
        movie2 = new Movie("The Godfather", "Drama", 2);
        movie3 = new Movie("The Godfather (Part 2)", "Drama", 3);
        movie4 = new Movie("The Dark Knight", "Fantasy", 4);
        movie5 = new Movie("12 Angry Men", "Suspense", 5);
        movie6 = new Movie("Schindler's List", "Drama", 6);
        movie7 = new Movie("Pulp Fiction", "Drama", 7);
        movie8 = new Movie("The Lord of the Rings: Return of the King", "Fantasy", 8);
        movie9 = new Movie("The Good, The Bad and The Ugly", "Western", 9);
        movie10 = new Movie("Fight Club", "Drama", 10);
        moviesToPassIn = new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
    }

    @Test
    public void testFirstInArray(){
        Ranking rankings = new Ranking(moviesToPassIn);
        assertEquals("Title: The Shawshank Redemption, Genre: Drama, Ranking: 1", rankings.getRanking(0).toString());
    }

    @Test
    public void testEighthInArray(){
        Ranking rankings = new Ranking(moviesToPassIn);
        assertEquals("Title: The Lord of the Rings: Return of the King, Genre: Fantasy, Ranking: 8", rankings.getRanking(7).toString());
    }

    @Test
    public void testAddToEndOfArray(){
        Ranking rankings = new Ranking(moviesToPassIn);
        movie10 = new Movie("Forrest Gump", "Drama", 10);
        rankings.setRanking(movie10);
        assertEquals("Title: Forrest Gump, Genre: Drama, Ranking: 10", rankings.getRanking(9).toString());
    }

}
