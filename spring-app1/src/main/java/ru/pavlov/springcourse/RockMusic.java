package ru.pavlov.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Queen - Bohemian Rhapsody";
    }
}
