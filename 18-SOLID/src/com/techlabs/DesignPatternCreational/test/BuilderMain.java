package com.techlabs.DesignPatternCreational.test;

import com.techlabs.DesignPatternCreational.model.BuilderHouseDirector;
import com.techlabs.DesignPatternCreational.model.BuilderPatternHouse;
import com.techlabs.DesignPatternCreational.model.IHouseBuilder;
import com.techlabs.DesignPatternCreational.model.SimpleHouseBuilder;

public class BuilderMain {

	 public static void main(String[] args) {
	        IHouseBuilder builder = new SimpleHouseBuilder(); // I want a simple house
	        BuilderHouseDirector director = new BuilderHouseDirector(builder); // Give the order to build it

	        BuilderPatternHouse myHouse = director.constructHouse(); // Build step-by-step
	        myHouse.showHouse(); // Show the final house
	    }
}
