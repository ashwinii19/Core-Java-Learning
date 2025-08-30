package com.techlabs.DesignPatternCreational.model;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton Created");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void write(String msg) {
		System.out.println("Teacher wrote: " + msg);
	}
}
