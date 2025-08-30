package com.techlabs.DesignPatternCreational.model;

public class PrototypeCar implements Cloneable {
    
	String model;
    public boolean hasSunroof;

    public PrototypeCar(String model, boolean hasSunroof) {
        this.model = model;
        this.hasSunroof = hasSunroof;
    }

    // Clone method (Prototype logic)
    public PrototypeCar clone() {
        return new PrototypeCar(this.model, this.hasSunroof);
    }

    //helper method
    public void showDetails() {
        System.out.println(model + " | Sunroof: " + hasSunroof);
    }
}