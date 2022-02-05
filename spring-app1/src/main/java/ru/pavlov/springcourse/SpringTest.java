package ru.pavlov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer OthermusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == OthermusicPlayer);
        System.out.println(musicPlayer);
        System.out.println(OthermusicPlayer);

        System.out.println(musicPlayer.getVolume());
        System.out.println(OthermusicPlayer.getVolume());

        musicPlayer.setVolume(55);

        System.out.println(musicPlayer.getVolume());
        System.out.println(OthermusicPlayer.getVolume());


        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
