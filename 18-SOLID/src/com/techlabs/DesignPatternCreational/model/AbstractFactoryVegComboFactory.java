package com.techlabs.DesignPatternCreational.model;

public class AbstractFactoryVegComboFactory implements IAbstractFactoryMealFactory{

	@Override
	public IAbstractFactoryBurger createBurger() {
		return new AbstractFactoryVegBurger();
	}

	@Override
	public IAbstractFactoryDrink createDrink() {
		return new AbstractFactorySprite();
	}

}
