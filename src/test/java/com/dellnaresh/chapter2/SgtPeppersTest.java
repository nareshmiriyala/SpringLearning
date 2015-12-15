package com.dellnaresh.chapter2;

import org.junit.Test;
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
public class SgtPeppersTest {
    @Autowired
    CompactDisc compactDisc;
    @Test
    public void testPlay() throws Exception {
    assertNotNull(compactDisc);
    }
}