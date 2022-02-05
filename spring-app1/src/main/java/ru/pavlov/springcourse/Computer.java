package ru.pavlov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    public String turnOnMusic(MusicType musicType) {
        return "Computer{" +  "id=" + id +  "}, musicPlayer: " + musicPlayer.playMusic(musicType);
    }
}
