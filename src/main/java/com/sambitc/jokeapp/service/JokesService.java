package com.sambitc.jokeapp.service;

import com.sambitc.jokeapp.JokeappApplication;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService(ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes=chuckNorrisQuotes;
    }

    public String getJoke(){
        String joke=chuckNorrisQuotes.getRandomQuote();
        return joke;
    }
}
