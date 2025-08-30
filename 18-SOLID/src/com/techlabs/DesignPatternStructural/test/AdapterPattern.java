package com.techlabs.DesignPatternStructural.test;

//Step 1: Target interface (what the laptop wants)
interface USBTypeC {
 void connectWithTypeC();
}

//Step 2: Adaptee class (what we have)
class USBTypeA {
 void connectWithTypeA() {
     System.out.println("Connected using USB Type A");
 }
}

//Step 3: Adapter class
class AdapterUSB extends USBTypeA implements USBTypeC {
 public void connectWithTypeC() {
     connectWithTypeA();  // internally adapts TypeA to TypeC
 }
}

//Step 4: Use adapter
public class AdapterPattern {
 public static void main(String[] args) {
     USBTypeC laptopPort = new AdapterUSB();
     laptopPort.connectWithTypeC();  // Output: Connected using USB Type A
 }
}
