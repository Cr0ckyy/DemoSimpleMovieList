package com.example.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> movieList;
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        lvExamTips = findViewById(R.id.listViewMovie);

        movieList = new ArrayList();
        movieList.add("Avengers Infinity War");
        movieList.add("Justice League");
        movieList.add("IP Man");
        movieList.add("Train to Busan 2");

        aaMovie = new ArrayAdapter(this, android.R.layout.simple_list_item_1, movieList);
        lvExamTips.setAdapter(aaMovie);
    }
}
