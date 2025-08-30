package com.techlabs.reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.reflection.model.Student;

public class StudentTest {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
//		Student student = new Student();
//		System.out.println(student.getClass());
		
//		Class c = Student.class;
//		System.out.println(c.getName());
//		
//		System.out.println("--------------------------");
//		Field[] field = c.getDeclaredFields();
//		System.out.println("Fields are: ");
//		for(Field fiel: field) {
//			System.out.println(fiel.getName());
//		}
//		
//		System.out.println();
//		System.out.println("--------------------------");
//		Method[] method = c.getDeclaredMethods();
//		System.out.println("Methods are: ");
//		for(Method meth: method) {
//			System.out.println("Method name: " +meth.getName());
//			System.out.println("Return type: "+meth.getReturnType());
//			System.out.println("Modifier is: "+Modifier.toString(meth.getModifiers()));
//		}
//		
//		System.out.println();
//		System.out.println("--------------------------");
//		Constructor[] constructor = c.getDeclaredConstructors();
//		System.out.println("Constructor are: ");
//		for(Constructor cons: constructor) {
//			System.out.println("Constructor name: " +cons.getName());
//			System.out.println("Modifier is: "+Modifier.toString(cons.getModifiers()));
//		}
		
		
		
//		//------------------------------------------------------------------------------------------------------------------------------
		
		Student student = new Student();
		
		Class c = Student.class;
		
		Field fields = c.getDeclaredField("cgpa");
		fields.setAccessible(true);
		fields.set(student, 9.13);
		System.out.println("cgpa is: "+fields.get(student));
		
		
		System.out.println("--------------------------");
		Method methods = c.getDeclaredMethod("greet");
		methods.setAccessible(true);
		methods.invoke(student);
		
		System.out.println();
		Method method = c.getDeclaredMethod("result", double.class);
		method.setAccessible(true);
		System.out.println("Result from result() method: "+method.invoke(student, 9.13));

		
		System.out.println("--------------------------");
		Constructor[] constructor = c.getDeclaredConstructors();
		for(Constructor con: constructor) {
			System.out.println("Constructor: "+con.getName());
		}
		
	}
}
