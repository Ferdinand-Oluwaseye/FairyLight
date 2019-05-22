package com.seye;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionOfLightsTest {

    @Test
    public void testCollection1() {
        CollectionOfLights col = new CollectionOfLights();
        int exp = 20;
        int results = col.lightsArraySize();
        assertEquals(exp, results);
    }

    @Test
    public void testCollection2() {
        CollectionOfLights col = new CollectionOfLights();
        int exp = 3;
        int results = col.getColourArraySize();
        assertEquals(exp, results);
    }

}
