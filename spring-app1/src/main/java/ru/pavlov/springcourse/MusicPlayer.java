package ru.pavlov.springcourse;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    static public MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    // IoC
    private MusicPlayer(List<Music> musics) {
        this.musicList = musics;
    }

    private MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music : musicList)
            System.out.println("Playing: " + music.getSong());
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
}
