package com.techlabs.serialization.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.model.Employee;

public class EmployeeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Employee employee = new Employee("Ashwini", 19, 33103);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
		out.writeObject(employee);
		out.close();
		System.out.println("Object saved successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee.txt"));
		Employee employee2 = (Employee) in.readObject();
		in.close();
		System.out.println("Object restored");
		employee2.displayInfo();
	}
}
