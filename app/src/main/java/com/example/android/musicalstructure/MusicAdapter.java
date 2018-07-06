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
                    R.layout.activity_songs, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTextView.setText(currentMusic.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText(currentMusic.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumTextView.setText(currentMusic.getAlbumName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView albumCoverView = (ImageView) listItemView.findViewById(R.id.album_cover);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        albumCoverView.setImageResource(currentMusic.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
