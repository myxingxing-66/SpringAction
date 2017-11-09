package cn.myxingxing.spring;

import org.springframework.stereotype.Component;

/**
 * Created by lixing on 17/11/3.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
