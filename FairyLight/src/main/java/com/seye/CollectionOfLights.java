package com.seye;


import com.seye.controllers.MainController;

import java.util.ArrayList;

import static com.seye.Utilities.Colors;

public class CollectionOfLights {

    private ArrayList<Light> lights;
    private Colors[] listOfColours;
    private MainController viewPrint;

    //constructor that accepts a number to create the right amount of lights
    public CollectionOfLights(int n) {
        viewPrint = new MainController();
        this.lights = new ArrayList<>();
        this.listOfColours = new Colors[]{Colors.RED, Colors.GREEN, Colors.WHITE};
        for (int i = 0; i < n; i++) {
            lights.add(new Light(i + 1, listOfColours[getColourIndex(i)]));
        }
    }

    //constructor that creates a fixed array of lights
    public CollectionOfLights() {
        int n = 20;
        this.lights = new ArrayList<>();
        this.listOfColours = new Colors[]{Colors.RED, Colors.GREEN, Colors.WHITE};
        for (int i = 0; i < n; i++) {
            lights.add(new Light(i + 1, listOfColours[getColourIndex(i)]));
        }
    }

    //get the index of a specific colour index
    public int getColourIndex(int n) {
        n = n % getColourArraySize();
        return n;
    }

    //return size of colour array
    public int getColourArraySize() {
        return listOfColours.length;
    }

    public int lightsArraySize() {
        return lights.size();
    }


    //turn off all lights
    public void turnOffAllLights() {
        for (Light k : lights) {
            k.switchOffState();
        }
    }

    //print list of colours
    public Colors[] getColorList() {
        return listOfColours;
    }

    public ArrayList<Light> getLightArray() {
        return lights;
    }

    //change light state by sequence
    public void changeState(Light l) {
        if (l.getState().equals(Utilities.Status.OFF)) {
            l.setState(Utilities.Status.ON);
        } else {
            l.setState(Utilities.Status.OFF);
        }
    }

    //change light states by colours
    public void switchState(Colors k) {

        for (Light s : lights) {
            if (s.getColour().equals(k)) {
                changeState(s);
                System.out.println(s.toString());
                viewPrint.printResults(s.toString());
            }
        }

    }

}
