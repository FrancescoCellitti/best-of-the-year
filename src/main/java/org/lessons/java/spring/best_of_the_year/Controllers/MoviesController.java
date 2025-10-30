package org.lessons.java.spring.best_of_the_year.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.spring.best_of_the_year.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesController {

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "FilmsPage";
        }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Inception", "Christopher Nolan", "Sci-Fi", 2010));
        movies.add(new Movie(2, "The Godfather", "Francis Ford Coppola", "Crime", 1972));
        movies.add(new Movie(3, "Pulp Fiction", "Quentin Tarantino", "Crime", 1994));
        movies.add(new Movie(4, "The Dark Knight", "Christopher Nolan", "Action", 2008));
        movies.add(new Movie(5, "Forrest Gump", "Robert Zemeckis", "Drama", 1994));

        return movies;
    }
}

  
