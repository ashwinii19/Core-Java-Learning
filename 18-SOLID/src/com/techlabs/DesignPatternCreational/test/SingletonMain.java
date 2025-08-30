package com.techlabs.DesignPatternCreational.test;

import com.techlabs.DesignPatternCreational.model.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		singleton1.write("Math");
		singleton2.write("Science");
		
		System.out.println(singleton1 == singleton2);
	}

	
}
