package com.example.user.movierankings;

/**
 * Created by user on 07/08/2017.
 */

public class Ranking {

    private Movie[] rankings;

    public Ranking(Movie[] rankings){
        this.rankings = rankings;
    }

    public Movie getRanking(int ranking) {
        return rankings[ranking];
    }

    public void setRanking(Movie ranking) {
        rankings[9] = ranking;
    }
}
