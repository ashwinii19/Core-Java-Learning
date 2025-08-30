package com.techlabs.DesignPatternCreational.test;

import com.techlabs.DesignPatternCreational.model.PrototypeCar;

public class PrototypeCarMain {

	public static void main(String[] args) {
		PrototypeCar basicCar = new PrototypeCar("Honda City", false);  // Original car (no sunroof)
		PrototypeCar sunroofCar = basicCar.clone();            // Clone it
        sunroofCar.hasSunroof = true;                 // Add sunroof to the cloned car

        // Show both cars
        basicCar.showDetails();    
        sunroofCar.showDetails();  
    }
}
