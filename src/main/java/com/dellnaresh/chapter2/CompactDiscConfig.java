package com.dellnaresh.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nareshm on 15/12/2015.
 */

@Configuration
public class CompactDiscConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
    @Bean
    public Movie teluguMovie(){
        return new TeluguMovie();
    }
    @Bean
    public MediaPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
