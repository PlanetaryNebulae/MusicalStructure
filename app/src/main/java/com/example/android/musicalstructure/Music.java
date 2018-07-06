package com.example.android.musicalstructure;

//Shows each song, with information about the song name, artist name, album name, and the album cover.

public class Music {

    //Name of the song.
    private String mSongName;

    //Name of the artist.
    private String mArtistName;

    //Name of the album
    private String mAlbumName;

    //Drawable album covers;
    private int mImageResourceId;

    //These are the objects that represent the song, artist, album, and album covers.
    public Music(String vSong, String vArtist, String vAlbum, int imageResourceId) {
        mSongName = vSong;
        mArtistName = vArtist;
        mAlbumName = vAlbum;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the name of the album.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the image resource ID.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
