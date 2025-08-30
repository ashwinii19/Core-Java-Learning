package com.techlabs.DesignPatternCreational.model;

public class AbstractFactoryChickenBurger implements IAbstractFactoryBurger {

	@Override
	public void prepare() {
        System.out.println("Preparing Chicken Burger");
    }
}


