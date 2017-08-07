package com.example.user.movierankings;

/**
 * Created by user on 07/08/2017.
 */

public class Movie {

    private String title;
    private String genre;

    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getMovieGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
