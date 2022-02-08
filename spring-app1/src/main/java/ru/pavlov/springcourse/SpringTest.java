package ru.pavlov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                MyCoolSpringConfig.class
        );
        Computer comp = context.getBean("computer", Computer.class);

        System.out.println(comp.turnOnMusic(MusicType.RAP));

        System.out.println("br1");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer.getName());

//        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
//        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);
//        System.out.println(rapMusic == rapMusic2);

        context.close();
    }
}
