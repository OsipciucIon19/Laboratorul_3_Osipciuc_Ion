package com.company.lab3.polimorfism;

public class Patrat extends Forma {

    private Double latura;

    public Patrat(String color, Double latura) {
        super(color);
        this.latura = latura;
    }

    public Double getLatura() {
        return latura;
    }

    public void setLatura(Double latura) {
        this.latura = latura;
    }

    @Override
    public String toString() {
        return "Patrat{" +
                "latura=" + latura +
                '}';
    }

    public Double aria() {
        return latura * latura;
    }
}
