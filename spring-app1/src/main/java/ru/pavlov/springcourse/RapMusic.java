package ru.pavlov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Random;

@Component
public class RapMusic implements Music {
    ArrayList<String> songs = new ArrayList<>();

    public RapMusic() {
        songs.add("Eminem - Kim");
        songs.add("Drake - Nonstop");
        songs.add("Slowtai - Door");
    }

    public String getRandomSong() {
        Random random = new Random();
        int min = 0;
        int max = songs.size();
        return songs.get(random.nextInt(max - min));
    }

    @Override
    public String getSong() {
        return getRandomSong();
    }

    @PostConstruct
    public void doInit() {
        System.out.println("doing: doInit()");
    }

    @PreDestroy
    public void doEnd() {
        System.out.println("doing: doEnd()");
    }
}
