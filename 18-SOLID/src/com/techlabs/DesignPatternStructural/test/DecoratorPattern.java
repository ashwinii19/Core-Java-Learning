package com.techlabs.DesignPatternStructural.test;

//Step 1: Base interface
interface Pizza {
 String makePizza();
}

//Step 2: Concrete class (Plain pizza)
class PlainPizza implements Pizza {
 public String makePizza() {
     return "Plain Pizza";
 }
}

//Step 3: Abstract Decorator
abstract class PizzaDecorator implements Pizza {
 protected Pizza pizza;

 public PizzaDecorator(Pizza pizza) {
     this.pizza = pizza;
 }

 public String makePizza() {
     return pizza.makePizza();
 }
}

//Step 4: Concrete Decorators (Toppings)
class CheeseDecorator extends PizzaDecorator {
 public CheeseDecorator(Pizza pizza) {
     super(pizza);
 }

 public String makePizza() {
     return super.makePizza() + " + Cheese";
 }
}

class OliveDecorator extends PizzaDecorator {
 public OliveDecorator(Pizza pizza) {
     super(pizza);
 }

 public String makePizza() {
     return super.makePizza() + " + Olives";
 }
}

class PaneerDecorator extends PizzaDecorator {
 public PaneerDecorator(Pizza pizza) {
     super(pizza);
 }

 public String makePizza() {
     return super.makePizza() + " + Paneer";
 }
}

//Step 5: Client code
public class DecoratorPattern {
 public static void main(String[] args) {
     Pizza pizza = new PlainPizza();                            // Plain Pizza
     pizza = new CheeseDecorator(pizza);                        // Add Cheese
     pizza = new OliveDecorator(pizza);                         // Add Olives
     pizza = new PaneerDecorator(pizza);                        // Add Paneer

     System.out.println(pizza.makePizza());                     // 🍕 Output
 }
}

