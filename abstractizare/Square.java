package com.company.lab3.abstractizare;

public class Square extends GraphicObject {
    public Square(String color, String name) {
        super(color, "patrat");
    }

    @Override
    void draw() {
        System.out.println("*********" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*        *" + "\n" +
                "*********");
    }
}
