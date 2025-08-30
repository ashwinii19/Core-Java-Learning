package com.techlabs.DesignPatternCreational.model;

public class AbstractFactorySprite implements IAbstractFactoryDrink {

	@Override
	public void pour() {
		System.out.println("Pouring Sprite");
	}

}
