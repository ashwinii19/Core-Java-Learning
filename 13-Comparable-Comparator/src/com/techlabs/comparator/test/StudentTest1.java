package com.techlabs.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.techlabs.comparator.model.Student1;
import com.techlabs.comparator.model.StudentSortUsingCamparatorDescendingID;
import com.techlabs.comparator.model.StudentSortUsingComparatorAscendingID;
import com.techlabs.comparator.model.StudentSortUsingComparatorAscendingName;
import com.techlabs.comparator.model.StudentSortUsingComparatorDescendingName;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Student1> list = new ArrayList<Student1>();
		
		list.add(new Student1("Ashwini", 10));
		list.add(new Student1("Jayesh", 13));
		list.add(new Student1("Durgesh", 2));
		list.add(new Student1("Mansi", 4));
		
		boolean exit = true;
		
		
		while(exit) {
			System.out.println("Choose Sorting Criteria: ");
			System.out.println("1. Sort by ID");
			System.out.println("2. Sort by name");
			int sorting = scanner.nextInt();
		
			System.out.println("Choose Order Criteria: ");
			System.out.println("1. Ascending");
			System.out.println("2. Descending");
			int order = scanner.nextInt();

			Comparator<Student1> comparator = null;
			if(sorting == 1 && order == 1) {
				Collections.sort(list, new StudentSortUsingComparatorAscendingID());
				System.out.println(list);
			}
			else if(sorting == 1 && order == 2) {
				Collections.sort(list, new StudentSortUsingCamparatorDescendingID());
				System.out.println(list);
			}
			else if(sorting == 2 && order == 1) {
				Collections.sort(list, new StudentSortUsingComparatorAscendingName());
				System.out.println(list);
			}
			else if(sorting == 2 && order == 2) {
				Collections.sort(list, new StudentSortUsingComparatorDescendingName());
				System.out.println(list);
			}
		
		}
		
		
		System.out.println(list);
//		Collections.sort(list, new StudentSortUsingComparatorAscending());
//		System.out.println(list);
//		Collections.sort(list, new StudentSortUsingComparatorDescending());
//		System.out.println(list);
		
		
	}
}
