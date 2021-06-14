package com.example.musicplayer;

public class song {

    private long id;
    private String title;
    private String artist;

    public song(long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public long getID() {
        return id;
    }
}
