package com.company.lab3.polimorfism;

public class Main {

    public static void main(String[] args) {

//        Exemple de la lectie
        Forma formaNecunoscuta = new Forma("verde");
        Patrat patrat = new Patrat("rosu", 3D);
        Triunghi triunghi = new Triunghi("verde", 5D, 7D);
        Dreptunghi dreptunghi = new Dreptunghi("rosu", 4D, 3D);
        Dreptunghi dreptunghiTwo = new Dreptunghi("rosu", 4D, 3D);

        Forma[] forme = {formaNecunoscuta, patrat, triunghi, dreptunghi, dreptunghiTwo};

        patrat.aria();

        for (Forma f:
            forme) {
            System.out.println(f.aria());
        }

        System.out.println("=======================================");

//        Laboratorul nr. 3
        Screen screen1 = new HdScreen("LG", 14D, 1280, 720);
        Screen screen2 = new FullHdScreen("Samsung", 14D,1920, 1080);
        Screen screen3 = new UltraHdScreen("Hisense", 14D, 3840, 2160);

        Screen[] screens = {screen1, screen2, screen3};

        for (Screen s: screens) {
            System.out.println(s);
            System.out.println("\t" + s.calculatePPI());
            System.out.println("\tPrice category : " + s.getPriceCategory() + "\n");
        }
    }
}
