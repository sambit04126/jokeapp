package com.sambitc.jokeapp.controller;

import com.sambitc.jokeapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;
    public JokesController(JokesService jokesService){
        this.jokesService=jokesService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "joke";

    }

}
