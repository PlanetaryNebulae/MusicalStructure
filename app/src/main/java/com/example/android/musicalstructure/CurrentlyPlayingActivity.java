package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CurrentlyPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        //Retrieves albumCover, songName, artistName, and albumName when a song is clicked.
        Intent currentlyPlayingIntent = getIntent().getStringExtra();
    }
}
