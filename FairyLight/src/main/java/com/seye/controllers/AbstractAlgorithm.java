package com.seye.controllers;

import com.seye.CollectionOfLights;

public abstract class AbstractAlgorithm implements Runnable {

    CollectionOfLights col;
    int time;

    public AbstractAlgorithm(CollectionOfLights col, int time) {
        this.col = col;
        this.time = time;
    }

    @Override
    public void run() {

    }

    public CollectionOfLights getCol() {
        return col;
    }

    public void setCol(CollectionOfLights col) {
        this.col = col;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
