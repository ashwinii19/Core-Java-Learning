package com.techlabs.comparable.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.techlabs.comparable.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Ashwini", 10));
		list.add(new Student("Durgesh", 2));
		list.add(new Student("Jayesh", 13));
		list.add(new Student("Mansi", 4));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
