package com.techlabs.DesignPatternCreational.model;

public class AbstractFactoryVegBurger implements IAbstractFactoryBurger{

	@Override
	public void prepare() {
		 System.out.println("Preparing Veg Burger");
	}

}
