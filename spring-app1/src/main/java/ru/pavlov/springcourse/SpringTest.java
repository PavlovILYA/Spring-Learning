package ru.pavlov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rapMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);
        Music music3 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = MusicPlayer.getMusicPlayer();

        musicPlayer.addMusic(music);
        musicPlayer.addMusic(music2);
        musicPlayer.addMusic(music3);
        musicPlayer.playMusic();

        context.close();
    }
}
