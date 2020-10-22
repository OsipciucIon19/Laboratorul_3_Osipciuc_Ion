package com.company.lab3.abstractizare;

public class Violonist implements Orchestra {
    @Override
    public void sing() {
        System.out.println("The violonist plays the violin.");
    }

    @Override
    public boolean playsIntrument() {
        return true;
    }
}
