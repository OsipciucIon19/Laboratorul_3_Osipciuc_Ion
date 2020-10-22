package com.company.lab3.abstractizare;

public class Brandmaster implements Orchestra {

    @Override
    public void sing() {
        System.out.println("The brandmaster leads the orchestra.");
    }

    @Override
    public boolean playsIntrument() {
        return false;
    }
}
