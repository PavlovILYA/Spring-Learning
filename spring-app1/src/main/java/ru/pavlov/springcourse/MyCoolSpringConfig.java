package ru.pavlov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class MyCoolSpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public HashMap<MusicType, Music> musicHashMap() {
        HashMap<MusicType, Music> musicMap = new HashMap<>();
        musicMap.put(MusicType.CLASSICAL, new ClassicalMusic());
        musicMap.put(MusicType.ROCK, new RockMusic());
        musicMap.put(MusicType.RAP, new RapMusic());
        return musicMap;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicHashMap());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
