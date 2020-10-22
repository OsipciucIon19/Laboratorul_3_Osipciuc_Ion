package com.company.lab3.abstractizare;

public class Circle extends GraphicObject{

    public Circle(String color, String nameObject) {
        super(color, "cerc");
    }

    @Override
    void draw() {
        double dist, radius = 4;

        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

}
