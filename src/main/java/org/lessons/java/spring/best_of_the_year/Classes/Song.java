package org.lessons.java.spring.best_of_the_year.Classes;

public class Song {
    private int id;
    private String title;   
    private String artist;
    private String genre;
    public Song(){

    }

    public Song(int id, String title, String artist, String genre){
        this.id = id;
        this.title = title;
        this.artist = artist;   
        this.genre = genre;
    }
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getGenre(){
        return genre;
    }
}
