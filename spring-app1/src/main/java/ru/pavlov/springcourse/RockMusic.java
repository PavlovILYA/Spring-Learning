package ru.pavlov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RockMusic implements Music {
    ArrayList<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("11-rock-11");
        songs.add("22-rock-22");
        songs.add("33-rock-33");
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
}
