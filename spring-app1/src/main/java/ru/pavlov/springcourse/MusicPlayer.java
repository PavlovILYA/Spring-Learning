package ru.pavlov.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    @Autowired
    private ClassicalMusic clMusic;
    private String name;
    private int volume;

    static public MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    // IoC
    private MusicPlayer(List<Music> musics) {
        this.musicList = musics;
    }

    @Autowired
    private MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                        @Qualifier("rockMusic") Music rockMusic,
                        @Qualifier("rapMusic") Music rapMusic) {
        musicList.add(classicalMusic);
        musicList.add(rockMusic);
        musicList.add(rapMusic);
    }

    private MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        String playing = "[";
        for (Music music : musicList)
            playing += "Playing: " + music.getSong() + " ";
        playing += "]";
        return playing;
    }

    public void addMusic(Music music) {
        musicList.add(music);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void doMyInit() {
        System.out.println("do: doMyInit()");
    }

    public void doMyDestroy() {
        System.out.println("do: doMyDestroy()");
    }

    public String getClMusic() {
        return clMusic.getSong();
    }
}
