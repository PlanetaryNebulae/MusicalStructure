package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Provides information for the layouts.

public class MusicAdapter extends ArrayAdapter<Music> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    //A custom constructor to put the data in a list.
    public MusicAdapter(Activity context, ArrayList<Music> musics) {
        super(context, 0, musics);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Music object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the song name from the current Music object and
        // set this text on the song TextView
        songTextView.setText(currentMusic.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the current Music object and
        // set this text on the artist TextView
        artistTextView.setText(currentMusic.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID album_name
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the album name from the current Music object and
        // set this text on the album TextView
        albumTextView.setText(currentMusic.getAlbumName());

        // Find the ImageView in the list_item.xml layout with the ID album_cover
        ImageView albumCoverView = (ImageView) listItemView.findViewById(R.id.album_cover);
        // Get the image resource ID from the current Music object and
        // set the image to albumCoverView
        albumCoverView.setImageResource(currentMusic.getImageResourceId());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
