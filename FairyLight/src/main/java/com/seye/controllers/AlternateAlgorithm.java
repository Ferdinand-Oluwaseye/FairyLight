package com.seye.controllers;

import com.seye.CollectionOfLights;

public class AlternateAlgorithm extends AbstractAlgorithm {

    //constructor that extends an abstract class
    public AlternateAlgorithm(CollectionOfLights col, int time) {
        super(col, time);
    }

    @Override
    public void run() {
        while (true) {

            System.out.println("\n");
            System.out.println("Start sequence");

            Thread d = new Thread(new SequenceAlgorithm(col, 1000));//Thread declaration
            d.start();//starts thread
            try {
                Thread.sleep(super.getTime());
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            d.interrupt();

            col.turnOffAllLights();
            System.out.println("\n");
            System.out.println("Start color");
            Thread k = new Thread(new ColoursAlgorithm(col, 500));
            k.start();
            try {
                Thread.sleep(getTime());
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            k.interrupt();
            col.turnOffAllLights();

        }
    }
}
