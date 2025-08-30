package com.techlabs.DesignPatternCreational.model;

public class FactoryCoffee implements IFactoryDrink{

	@Override
	public void serve() {
		System.out.println("Serving Coffee");
	}

}
