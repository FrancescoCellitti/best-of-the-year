package org.lessons.java.spring.best_of_the_year;

public class Movie {
    private int id;
    private String title;
    private String director;    
    private String genre;
    private int year;
    
    // Costruttori
    public Movie() {
    }
    
    public Movie(int id, String title, String director, String genre, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }
    
    // Getter e Setter

    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
   
    
    public String getDirector() {
        return director;
    }
    
    
    public String getGenre() {
        return genre;
    }
    
   
    
    public int getYear() {
        return year;
    }
    
    
}