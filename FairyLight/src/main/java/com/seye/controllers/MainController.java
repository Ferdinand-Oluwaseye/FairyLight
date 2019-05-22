package com.seye.controllers;

import com.seye.CollectionOfLights;

import java.util.Scanner;

public class MainController {

    public MainController() {

    }

    //main menu list
    public void runMainMenu() {
        printResults("Enter the number of lights you want");
        int numberOfLights = getInput("of lights");
        printResults("Please Select a task by inputting a number");
        printResults("1. Colour Algorithm");
        printResults("2. Sequence Algorithm");
        printResults("3. Alternate Algorithm");
        int task = getInput("for an algorithm");
        Thread ds;

        switch (task) {

            case 1:
                ColoursAlgorithm ck = new ColoursAlgorithm(getCollection(numberOfLights), 1000);
                ds = new Thread(ck);
                ds.start();
                break;

            case 2:
                SequenceAlgorithm sk = new SequenceAlgorithm(getCollection(numberOfLights), 500);
                ds = new Thread(sk);
                ds.start();
                break;

            case 3:
                AlternateAlgorithm ak = new AlternateAlgorithm(getCollection(numberOfLights), 30000);
                ds = new Thread(ak);
                ds.start();
                break;

            default:
                break;
        }
    }

    //get user input
    private int getInput(String message) {
        int input;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            input = sc.nextInt();
        } else {
            System.out.println("Enter a number" + message);
            input = sc.nextInt();
        }
        return input;
    }

    //get the amount of lights
    private CollectionOfLights getCollection(int k) {
        CollectionOfLights li;
        if (k == 0) {
            li = new CollectionOfLights();
        } else {
            li = new CollectionOfLights(k);
        }

        return li;
    }

    //method to display various
    public void printResults(String results) {
        System.out.println(results);
    }
}
