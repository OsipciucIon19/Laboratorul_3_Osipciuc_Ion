package com.company.lab3.polimorfism;

public class Dreptunghi extends Forma {

    private Double lungime, latime;

    public Dreptunghi(String color, Double lungime, Double latime) {
        super(color);
        this.latime = latime;
        this.lungime = lungime;
    }

    public Double getLungime() {
        return lungime;
    }

    public void setLungime(Double lungime) {
        this.lungime = lungime;
    }

    public Double getLatime() {
        return latime;
    }

    public void setLatime(Double latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }

    @Override
    public Double aria() {
        return latime * lungime;
    }
}
