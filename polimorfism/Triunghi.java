package com.company.lab3.polimorfism;

public class Triunghi extends Forma {

    private Double baza;
    private Double inaltime;


    public Triunghi(String color, Double baza, Double inaltime) {
        super(color);
        this.baza = baza;
        this.inaltime = inaltime;
    }

    public Double getBaza() {
        return baza;
    }

    public void setBaza(Double baza) {
        this.baza = baza;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "Triunghi{" +
                "baza=" + baza +
                ", inaltime=" + inaltime +
                '}';
    }

    @Override
    public Double aria() {
        return baza*inaltime/2;
    }
}
