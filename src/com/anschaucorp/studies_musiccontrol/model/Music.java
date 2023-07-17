package com.anschaucorp.studies_musiccontrol.model;


public class Music extends Audio {
    private String album;
    private String artist;
    private String type;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getClassification() {
        if (this.getTotalTimesPlayed() > 2000 ) {
            return 10;
        } else {
            return 7;
        }
    }
}
