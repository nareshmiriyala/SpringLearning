
package com.dellnaresh.chapter2;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nareshm on 15/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CDPlayerTest {
    @Autowired
    private MediaPlayer cdPlayer;
    @Rule
    public final SystemOutRule log =
            new SystemOutRule();

    @Test
    public void testCDPlayer() throws Exception {
        cdPlayer.playDisc();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
                " by The Beatles",log.enableLog().getLog());
    }
}