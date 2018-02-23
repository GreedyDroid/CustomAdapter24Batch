package com.example.sayed.customadapter24batch;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by nurud on 9/27/2017.
 */

public class Movie implements Serializable{
    private String movieName;
    private String movieYear;
    private int movieImg;

    public Movie(String movieName, String movieYear, int movieImg) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieImg = movieImg;
    }

    public Movie() {
    }

    public Movie(String movieName, String movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public int getMovieImg() {
        return movieImg;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public void setMovieImg(int movieImg) {
        this.movieImg = movieImg;
    }

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie>movies=new ArrayList<>();
        movies.add(new Movie("Transformars", "2012", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Troy", "2014", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Spider Man", "2015", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Boss Baby", "2017", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Minions", "2016", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Dispicable ME", "2014", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Programers", "2012", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Algorithm", "2012", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Interstaller", "2012", R.mipmap.ic_launcher_round));
        movies.add(new Movie("Lucy", "2012", R.mipmap.ic_launcher_round));

        return movies;
    }
}
