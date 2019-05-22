package com.seye;

import static com.seye.Utilities.Colors;
import static com.seye.Utilities.Status;

public class Light {

    private Colors colour;
    private Status state;
    private int index;


    public Light(int index, Colors colour) {
        this.index = index;
        this.colour = colour;
        this.state = Status.OFF;
    }

    public Colors getColour() {
        return colour;
    }

    public void setColour(Colors colour) {
        this.colour = colour;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public void switchOnState() {
        setState(Status.ON);
    }

    public void switchOffState() {
        setState(Status.OFF);
    }

    @Override
    public String toString() {
        return "Light: " + index + " " + colour + " " + state;
    }
}
