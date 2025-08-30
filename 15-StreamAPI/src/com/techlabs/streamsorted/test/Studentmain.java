package com.techlabs.streamsorted.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.techlabs.streamsorted.model.Student;

public class Studentmain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		String name = "";
//		int rollNumber = 0;
//		double cgpa = 0.0;
//
//		ArrayList<String> names = new ArrayList<>();
//		ArrayList<Integer> rollNumbers = new ArrayList<>();
//		ArrayList<Double> cgpas = new ArrayList<>();
//
//		System.out.print("How many student you want to enter: ");
//		int number = scanner.nextInt();
//		System.out.println();
//		
//		Student[] student = new Student[number];
//		scanner.nextLine();
//
//		for (int i = 0; i < number; i++) {
//			System.out.println("------------------------------------");
//			System.out.print("Enter the Student " + (i + 1) + " name: ");
//			name = scanner.nextLine();
//			names.add(name);
//
//			System.out.print("Enter the Student " + (i + 1) + " Roll Number: ");
//			rollNumber = scanner.nextInt();
//			rollNumbers.add(rollNumber);
//
//			System.out.print("Enter the Student " + (i + 1) + " CGPA: ");
//			cgpa = scanner.nextDouble();
//			cgpas.add(cgpa);
//
//			student[i] = new Student(name, rollNumber, cgpa);
//			scanner.nextLine();
//		}
//
//		System.out.println("------------------------------------");
//		System.out.println("Names by sorted: ");
//		List<String> nam = names.stream().sorted().collect(Collectors.toList());
//		System.out.println(nam);
//		System.out.println("------------------------------------");
//		System.out.println("Roll Number by sorted: ");
//		List<Integer> roll = rollNumbers.stream().sorted().collect(Collectors.toList());
//		System.out.println(roll);
//		System.out.println("------------------------------------");
//		System.out.println("CGPA by sorted: ");
//		List<Double> cgp = cgpas.stream().sorted().collect(Collectors.toList());
//		System.out.println(cgp);

//		------------------------------------------------------------------------------------------------------

		List<Student> ll = new ArrayList<>();

		System.out.print("How many student you want to enter: ");
		int number = scanner.nextInt();
		System.out.println();
		scanner.nextLine();

		for (int i = 0; i < number; i++) {
			System.out.println("------------------------------------");
			System.out.print("Enter the Student " + (i + 1) + " name: ");
			String name = scanner.nextLine();

			System.out.print("Enter the Student " + (i + 1) + " Roll Number: ");
			int rollNumber = scanner.nextInt();

			System.out.print("Enter the Student " + (i + 1) + " CGPA: ");
			double cgpa = scanner.nextDouble();

			ll.add(new Student(name, rollNumber, cgpa));
			scanner.nextLine();
		}

		System.out.println("------------------------------------");
		System.out.println("Sorted on Names: ");
		List<String> names = ll.stream().map(n -> n.getName()).sorted(Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase)).collect(Collectors.toList());				//Length wise sorted
		System.out.println(names);
		
		System.out.println("------------------------------------");
		System.out.println("Sorted on Roll Number: ");
		List<Integer> rollNumbers = ll.stream().map(r -> r.getRollNumber()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());						//reverse
		System.out.println(rollNumbers);
		
		System.out.println("------------------------------------");
		System.out.println("Sorted on CGPA: ");
		List<Double> cgpas = ll.stream().map(c -> c.getCgpa()).sorted().collect(Collectors.toList());
		System.out.println(cgpas);

	}
}
