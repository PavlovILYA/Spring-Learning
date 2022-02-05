package ru.pavlov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Computer comp = context.getBean("computer", Computer.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        System.out.println(comp.turnOnMusic(MusicType.CLASSICAL));
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);
        System.out.println(rapMusic == rapMusic2);


        context.close();
    }
}
