package com.techlabs.DesignPatternCreational.model;

public class FactoryTea implements IFactoryDrink{

	@Override
	public void serve() {
		System.out.println("Serving Tea");
	}

}
