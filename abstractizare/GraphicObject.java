package com.company.lab3.abstractizare;

public abstract class GraphicObject {

    private String color;
    private String name;

    public GraphicObject(String color, String name) {
        this.color = color;
        this.name = name;
    }

    abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
