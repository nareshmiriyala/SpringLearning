package com.dellnaresh.chapter2;

import org.springframework.stereotype.Component;

/**
 * Created by nareshm on 15/12/2015.
 */
@Component
public class TeluguMovie implements Movie {
    public void play() {
        System.out.println("Playing Telugu movie");
    }
}
