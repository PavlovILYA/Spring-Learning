package ru.pavlov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

public class ClassicalMusic implements Music {
    ArrayList<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("F. Schubert - Serenade");
        songs.add("Mozart – Eine kleine Nachtmusik");
        songs.add("Beethoven – Für Elise");
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
