package org.lessons.java.spring.best_of_the_year.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;
import org.lessons.java.spring.best_of_the_year.Song;

@Controller
public class SongController {
    @GetMapping("/songs")
    public String songs(Model model) {
       List<Song> songs = new ArrayList<>();   
         songs.add(new Song(1, "Bohemian Rhapsody", "Queen", "Rock"));
         songs.add(new Song(2, "Imagine", "John Lennon", "Pop"));
         songs.add(new Song(3, "Billie Jean", "Michael Jackson", "Pop"));
         songs.add(new Song(4, "Smells Like Teen Spirit", "Nirvana", "Grunge"));

         model.addAttribute("songs", songs);
        return "SongsPages";

        
    }

}
