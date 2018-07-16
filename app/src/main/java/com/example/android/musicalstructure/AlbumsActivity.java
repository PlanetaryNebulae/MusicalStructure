package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    private static final String ALBUM_COVER = "album_cover";
    private static final String SONG_NAME = "song_name";
    private static final String ARTIST_NAME = "artist_name";
    private static final String ALBUM_NAME = "album_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //An array list of songs organized alphabetically by album.
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Left in the Snow", "No Mana", "Above the Blue EP", R.drawable.above_blue_cover));
        musics.add(new Music("Superliminal", "deadmau5", ">Album Title Goes Here<", R.drawable.album_title_cover));
        musics.add(new Music("Little Too Close", "WRLD", "Chase It EP", R.drawable.chase_it_cover));
        musics.add(new Music("Surrounded", "Mr FijiWiji", "Dogma EP", R.drawable.dogma_ep_cover));
        musics.add(new Music("Lethargy", "No Mana", "Game Over", R.drawable.game_over_cover));
        musics.add(new Music("Let the Sky Fall Down", "Mr FijiWiji", "Lost Lost Lost", R.drawable.lost_lost_lost_cover));
        musics.add(new Music("Mortality", "Mr FijiWiji", "Lost Lost Lost", R.drawable.lost_lost_lost_cover));
        musics.add(new Music("Fighter", "WRLD", "Single", R.drawable.fighter_cover));
        musics.add(new Music("Of Foxes and Hounds", "Varien", "Single", R.drawable.foxes_hounds_cover));
        musics.add(new Music("Other Side", "No Mana", "Single", R.drawable.other_side_cover));
        musics.add(new Music("Valkyrie", "Varien", "Single", R.drawable.valkyrie_cover));
        musics.add(new Music("Whispers in the Mist", "Varien", "Single", R.drawable.whispers_mist_cover));
        musics.add(new Music("Melancholy", "Rezz", "Something Wrong Here EP", R.drawable.something_wrong_cover));
        musics.add(new Music("Lost", "Rezz", "The Silence is Deafening EP", R.drawable.silence_deafening_cover));
        musics.add(new Music("Creep", "deadmau5", "While(1<2)", R.drawable.while_album_cover));
        musics.add(new Music("Seeya", "deadmau5", "While(1<2)", R.drawable.while_album_cover));


        // Create an {@link MusicAdapter}, whose data source is a list of
        // {@link Music}. The adapter knows how to create list item views for each item
        // in the list.
        MusicAdapter musicAdapter = new MusicAdapter(this, musics);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_music);
        listView.setAdapter(musicAdapter);

        //When user clicks on a song, it takes them to the Currently Playing screen.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                Music currentMusic = musics.get(i);

                Intent currentlyPlayingIntent = new Intent(AlbumsActivity.this, CurrentlyPlayingActivity.class);
                currentlyPlayingIntent.putExtra(ALBUM_COVER, currentMusic.getImageResourceId());
                currentlyPlayingIntent.putExtra(SONG_NAME, currentMusic.getSongName());
                currentlyPlayingIntent.putExtra(ARTIST_NAME, currentMusic.getArtistName());
                currentlyPlayingIntent.putExtra(ALBUM_NAME, currentMusic.getAlbumName());
                startActivity(currentlyPlayingIntent);
            }
        });
    }
}
