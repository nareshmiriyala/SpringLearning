package com.dellnaresh.chapter2;

import org.springframework.stereotype.Component;

/**
 * Created by nareshm on 15/12/2015.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
