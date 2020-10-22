package com.company.lab3.polimorfism;

public class HdScreen extends Screen {

    private int resolutionX;
    private int resolutionY;

    public HdScreen(String name, double sizeInch, int resolutionX, int resolutionY) {
        super(name, sizeInch, "low");
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }


    //    Method to get the Pixels per Inch of the Screen
    public String calculatePPI() {
        double ppi = (double) Math.sqrt(Math.pow(getResolutionX(), 2) + Math.pow(getResolutionY(), 2))  / getSizeInch();
        return "The PPI of " + getName() + " screen is : " + ppi;
    }

    @Override
    public String toString() {
        return "HdScreen{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
