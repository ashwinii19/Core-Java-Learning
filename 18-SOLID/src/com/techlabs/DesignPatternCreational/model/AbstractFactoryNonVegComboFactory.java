package com.techlabs.DesignPatternCreational.model;

public class AbstractFactoryNonVegComboFactory implements IAbstractFactoryMealFactory{

	@Override
	public IAbstractFactoryBurger createBurger() {
		return new AbstractFactoryChickenBurger();
	}

	@Override
	public IAbstractFactoryDrink createDrink() {
		return new AbstractFactoryCoke();
	}

}
