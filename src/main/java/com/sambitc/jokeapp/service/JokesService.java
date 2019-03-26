package com.sambitc.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class JokesService extends ChuckNorrisQuotes{

    public String getJoke(){
        String joke=this.getRandomQuote();
        return joke;
    }
}
