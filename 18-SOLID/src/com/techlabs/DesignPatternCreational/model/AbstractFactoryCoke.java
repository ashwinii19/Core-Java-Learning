package com.techlabs.DesignPatternCreational.model;

public class AbstractFactoryCoke implements IAbstractFactoryDrink {

	@Override
	public void pour() {
		System.out.println("Pouring Coke");
	}

}
