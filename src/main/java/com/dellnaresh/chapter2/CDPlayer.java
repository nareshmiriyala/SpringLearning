package com.dellnaresh.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nareshm on 15/12/2015.
 */
@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc=compactDisc;
    }
    public void playDisc(){
        compactDisc.play();
    }
}
