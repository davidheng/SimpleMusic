package com.support.david.simplemusic;

/**
 * Created by David on 11/10/14.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Song( long id, String title, String artist)
    {
        this.id = id;

        this.title = title;
        this.artist = artist;
    }
}
