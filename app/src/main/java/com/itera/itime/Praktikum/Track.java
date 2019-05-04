package com.itera.itime.Praktikum;

public class Track {
    private String Id;
    private String TrackName;
    private int Rating;

    public Track(){

    }

    public Track(String id, String trackname, int rating){
        this.Id = id;
        this.TrackName = trackname;
        this.Rating = rating;
    }

    public String getTrackName(){
        return TrackName;
    }

    public int getRating(){
        return Rating;
    }
}
