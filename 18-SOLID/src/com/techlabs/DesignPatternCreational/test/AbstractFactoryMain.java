package com.techlabs.DesignPatternCreational.test;

import com.techlabs.DesignPatternCreational.model.AbstractFactoryVegComboFactory;
import com.techlabs.DesignPatternCreational.model.IAbstractFactoryBurger;
import com.techlabs.DesignPatternCreational.model.IAbstractFactoryDrink;
import com.techlabs.DesignPatternCreational.model.IAbstractFactoryMealFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		IAbstractFactoryMealFactory factory = new AbstractFactoryVegComboFactory();
		
		IAbstractFactoryBurger burger = factory.createBurger();
		burger.prepare();
		
		IAbstractFactoryDrink drink = factory.createDrink();
		drink.pour();
	}
}
