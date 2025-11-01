package org.lessons.java.spring.best_of_the_year.Controllers;

import org.lessons.java.spring.best_of_the_year.Classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongController {
    
    private List<Song> getBestSongs() {
       List<Song> songs = new ArrayList<>();   
         songs.add(new Song(1, "Bohemian Rhapsody", "Queen", "Rock"));
         songs.add(new Song(2, "Imagine", "John Lennon", "Pop"));
         songs.add(new Song(3, "Billie Jean", "Michael Jackson", "Pop"));
         songs.add(new Song(4, "Smells Like Teen Spirit", "Nirvana", "Grunge"));
        return songs;

        
    }


    @GetMapping("/songs")
    public String songs(Model model) {
        List<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "SongsPages";
    }

    public Song getSongById(int id){
        List<Song> songs = getBestSongs();
        for(Song song : songs){
            if (song.getId() == id){
                return song;
            }
        }
        return null;
    }

    @GetMapping("/songs/{id}")
    public String songDetails(@PathVariable int id, Model model){
        Song song = getSongById(id);
        if (song != null){
            model.addAttribute("song", song);
            return "songDetails";
        }
        else{
            return "redirect:/songs";
        }

    }
   

}
