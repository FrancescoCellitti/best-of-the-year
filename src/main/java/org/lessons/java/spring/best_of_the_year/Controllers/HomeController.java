package org.lessons.java.spring.best_of_the_year.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(String name,Model model) {
        model.addAttribute("name", "Francesco");
        return "HomePage";
    }


    
}
