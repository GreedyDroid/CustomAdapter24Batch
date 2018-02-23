package com.example.sayed.customadapter24batch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView movieList;
    private ArrayList<Movie>movies;
    private Movie movie;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList= (ListView) findViewById(R.id.movieLVid);
        movie = new Movie();
        movies = movie.getAllMovie();
        movieAdapter=new MovieAdapter(this, movies);

        movieList.setAdapter(movieAdapter);
        movieList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Movie singleMove= movies.get(i);

                Intent intent = new Intent(MainActivity.this, MovieDetail.class);
                intent.putExtra("singleMovieObject",singleMove);
                startActivity(intent);
                startActivityForResult(intent, 0);
            }
        });
    }
}
