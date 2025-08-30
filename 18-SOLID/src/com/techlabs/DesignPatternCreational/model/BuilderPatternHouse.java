package com.techlabs.DesignPatternCreational.model;
// Product class – the final House
public class BuilderPatternHouse {

	String foundation;
    String structure;
    String roof;
    String paint;

    public void showHouse() {
        System.out.println("House with:");
        System.out.println("Foundation: " + foundation);
        System.out.println("Structure: " + structure);
        System.out.println("Roof: " + roof);
        System.out.println("Paint: " + paint);
    }
}
