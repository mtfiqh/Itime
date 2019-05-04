package com.itera.itime.Praktikum;

public class Artist {
    private String ArtistID;
    private String ArtistName;
    private String ArtistGenre;

    public Artist(){

    }

    public Artist(String artistid, String artistname, String artistgenre){
        this.ArtistGenre = artistgenre;
        this.ArtistID = artistid;
        this.ArtistName = artistname;
    }

    public String getArtistID(){
        return ArtistID;
    }

    public String getArtistName(){
        return ArtistName;
    }

    public String getArtistGenre(){
        return ArtistGenre;
    }

}
