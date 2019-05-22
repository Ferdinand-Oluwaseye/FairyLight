package com.seye;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class LightTest {


    @Test
    public void testLightColour() {
        Light k = new Light(1, Utilities.Colors.WHITE);
        Utilities.Colors exp = Utilities.Colors.WHITE;
        assertEquals(exp, k.getColour());
    }

    @Test
    public void testLightState() {
        Light k = new Light(1, Utilities.Colors.WHITE);
        Utilities.Status exp = Utilities.Status.OFF;
        assertEquals(exp, k.getState());
    }

    @Test
    public void testLightString() {
        Light k = new Light(1, Utilities.Colors.WHITE);
        String exp = "Light no: " + "1" + " Colour: " + "WHITE" + " Status: " + "OFF" + '}';
        assertEquals(exp, k.toString());
    }

    @Test
    public void testLightState2() {
        Light k = new Light(1, Utilities.Colors.WHITE);
        Utilities.Status exp = Utilities.Status.ON;
        assertFalse(exp.equals(k.getState()));
    }

    @Test
    public void testLightColour2() {
        Light k = new Light(1, Utilities.Colors.WHITE);
        Utilities.Colors exp = Utilities.Colors.RED;
        assertFalse(exp.equals(k.getColour()));
    }


}
