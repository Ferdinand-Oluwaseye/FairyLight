package com.seye.controllers;

import com.seye.CollectionOfLights;
import com.seye.Light;

public class SequenceAlgorithm extends AbstractAlgorithm {
    private MainController viewPrint;

    //constructor that extends an abstract class
    public SequenceAlgorithm(CollectionOfLights col, int time) {
        super(col, time);
        this.viewPrint = new MainController();
    }

    @Override
    public void run() {
        //infinite loop
        while (true) {
            runSequence();

        }
    }

    private void runSequence() {
        //loop with a thread that stops the loop for x seconds
        Thread t = new Thread();
        for (Light k : col.getLightArray()) {

            try {
                col.changeState(k);
                ;
                t.sleep(time);
                viewPrint.printResults(k.toString());
                col.changeState(k);
                t.sleep(time);
                viewPrint.printResults(k.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
