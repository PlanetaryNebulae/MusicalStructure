package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CurrentlyPlayingActivity extends AppCompatActivity {

    private static final String ALBUM_COVER = "album_cover";
    private static final String SONG_NAME = "song_name";
    private static final String ARTIST_NAME = "artist_name";
    private static final String ALBUM_NAME = "album_name";

    private int albumCover;
    private String songName;
    private String artistName;
    private String albumName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            albumCover = extras.getInt(ALBUM_COVER);
            songName = extras.getString(SONG_NAME);
            artistName = extras.getString(ARTIST_NAME);
            albumName = extras.getString(ALBUM_NAME);

        }
    }
}
