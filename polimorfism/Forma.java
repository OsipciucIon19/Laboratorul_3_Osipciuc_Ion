package com.company.lab3.polimorfism;

public class Forma {
    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "color='" + color + '\'' +
                '}';
    }

    public Double aria() {
        return 0.0D;
    }
}
