package com.seye.controllers;

import com.seye.CollectionOfLights;
import com.seye.Utilities;

public class ColoursAlgorithm extends AbstractAlgorithm {
    private Utilities.Colors[] colours;

    //constructor that extends an abstract class
    public ColoursAlgorithm(CollectionOfLights col, int time) {
        super(col, time);
        this.colours = col.getColorList();
    }

    @Override
    public void run() {
        while (true) {

            runColours();
        }
    }

    private void runColours() {
        for (int i = 0; i < colours.length; i++) {
            super.getCol().switchState(colours[i]);
            try {
                Thread.sleep(super.getTime());

            } catch (InterruptedException e) {

                continue;
            }
        }
    }

}
