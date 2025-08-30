package com.techlabs.inheritance.test;

import com.techlabs.inheritance.model.Bike;
import com.techlabs.inheritance.model.Car;

public class VehicleCarBikeTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.features();
		
		Bike bike = new Bike();
		System.out.println("--------------------");
		bike.features();
	}
}
