package com.company.lab3.polimorfism;


public class Screen {

    private String name;
    private double sizeInch;
    private String priceCategory = "null";

    public Screen(String name, double sizeInch, String priceCategory) {
        this.name = name;
        this.sizeInch = sizeInch;
        this.priceCategory = priceCategory;
    }

//    Method to get the Pixels per Inch of the Screen
    public String calculatePPI() {
        return "The PPI of your notebook is: unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSizeInch() {
        return sizeInch;
    }

    public void setSizeInch(Double sizeInch) {
        this.sizeInch = sizeInch;
    }

    public void setSizeInch(double sizeInch) {
        this.sizeInch = sizeInch;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "name='" + name + '\'' +
                ", sizeInch=" + sizeInch +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }
}
