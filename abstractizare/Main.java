package com.company.lab3.abstractizare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle("rosu", "rerc");
        GraphicObject square1 = new Square("albastru", "patrat");

        GraphicObject[] objects = {circle1, square1};

        for (GraphicObject o:
             objects) {
            System.out.println(o.getName());
            o.draw();
            System.out.println();
        }

        System.out.println("=======================");

//        Interfata
        Orchestra participant1 = new Violonist();
        Orchestra participant2 = new Brandmaster();

        List<Orchestra> orchestras = new ArrayList<>();
        orchestras.add(participant1);
        orchestras.add(participant2);

        for (Orchestra o:
             orchestras) {
            o.sing();
            System.out.println("Does he play an instrument? " + o.playsIntrument() + "\n");
        }
    }
}
