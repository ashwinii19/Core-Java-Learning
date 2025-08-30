package com.techlabs.DesignPatternCreational.model;

public class DrinkFactory {

	public static IFactoryDrink getDrink(String type) { 
		if (type.equalsIgnoreCase("tea")) {
			return new FactoryTea();
		} else if (type.equalsIgnoreCase("coffee")) {
			return new FactoryCoffee();
		}
		return null;
	}
}




//The object is still created using "new" keyword internally, but you don’t write "new" in your main code.
//The creation logic is hidden in a method, usually like getDrink(String type).