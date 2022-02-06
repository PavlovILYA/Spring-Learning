package ru.pavlov.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

public class MusicPlayer {
    private HashMap<MusicType, Music> musicHashMap = new HashMap<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

//    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
//                        @Qualifier("rockMusic") Music rockMusic,
//                        @Qualifier("rapMusic") Music rapMusic) {
//        musicHashMap.put(MusicType.CLASSICAL, classicalMusic);
//        musicHashMap.put(MusicType.ROCK, rockMusic);
//        musicHashMap.put(MusicType.RAP, rapMusic);
//    }

    public MusicPlayer(HashMap<MusicType, Music> musicHashMap) {
        this.musicHashMap = musicHashMap;
    }

    public String playMusic(MusicType musicType) {
        return musicHashMap.get(musicType).getSong();
    }

    public String getName() {
        return name;
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
