package com.techlabs.DesignPatternStructural.test;

//Step 1: Color Interface (Implementation side ---------------- Kaise kaam hoga)
interface Color {
 void applyColor();
}

//Step 2: Concrete Colors
class Red implements Color {
 public void applyColor() {
     System.out.println("Applying red color");
 }
}

class Blue implements Color {
 public void applyColor() {
     System.out.println("Applying blue color");
 }
}

//Step 3: Shape (Abstraction side ---------- Kaam kya karna hai)
abstract class Shape {
 protected Color color;  // Bridge connection ------ Abstraction ko Implementation se jodta hai bina tightly couple kiye

 public Shape(Color color) {
     this.color = color;
 }

 abstract void draw();
}

//Step 4: Concrete Shapes
class Circle extends Shape {
 public Circle(Color color) {
     super(color);
 }

 public void draw() {
     System.out.print("Circle filled with ");
     color.applyColor();  // Bridge in action
 }
}

class Square extends Shape {
 public Square(Color color) {
     super(color);
 }

 public void draw() {
     System.out.print("Square filled with ");
     color.applyColor();
 }
}

//Step 5: Client code
public class BridgePattern {
 public static void main(String[] args) {
     Shape redCircle = new Circle(new Red());
     redCircle.draw();  // Circle filled with red color

     Shape blueSquare = new Square(new Blue());
     blueSquare.draw(); // Square filled with blue color
 }
}

