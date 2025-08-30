package com.techlabs.abstractexample.test;

import com.techlabs.abstractexample.model.Circle;
import com.techlabs.abstractexample.model.Shape;
import com.techlabs.abstractexample.model.Square;
import com.techlabs.abstractexample.model.Traingle;

public class ShapeTest {
public static void main(String[] args) {
	Shape[] shape = new Shape[3];
	shape[0]= new Circle("Circal");
	shape[1]= new Traingle("Traingle");
	shape[2]= new Square("Square");
	
	for(Shape s : shape ) {
		s.display();
	}
	
}
}
