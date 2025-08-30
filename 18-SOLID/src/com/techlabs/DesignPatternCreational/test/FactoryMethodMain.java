package com.techlabs.DesignPatternCreational.test;

import com.techlabs.DesignPatternCreational.model.DrinkFactory;
import com.techlabs.DesignPatternCreational.model.IFactoryDrink;

public class FactoryMethodMain {

	public static void main(String[] args) {
        IFactoryDrink d1 = DrinkFactory.getDrink("tea");
        d1.serve();

        IFactoryDrink d2 = DrinkFactory.getDrink("coffee");
        d2.serve();
    }
}
