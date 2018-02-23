package com.example.sayed.customadapter24batch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class MovieDetail extends AppCompatActivity implements Serializable{
    private TextView movieName, movieYear;
    private ImageView movieImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movieName = (TextView) findViewById(R.id.movieNameID2nd);
        movieYear = (TextView) findViewById(R.id.movieYearID2nd);
        movieImg = (ImageView) findViewById(R.id.movieImgID2nd);

        Movie singleMovie = (Movie) getIntent().getSerializableExtra("singleMovieObject");
        movieName.setText(singleMovie.getMovieName());
        movieYear.setText(singleMovie.getMovieYear());
        movieImg.setImageResource(singleMovie.getMovieImg());
    }
}
