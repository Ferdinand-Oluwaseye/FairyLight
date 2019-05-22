package com.seye;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void arrayColorSize() {
        CollectionOfLights li = new CollectionOfLights();
        int exp = 2;
        assertEquals(exp, li.getColourIndex(5));
    }
}
