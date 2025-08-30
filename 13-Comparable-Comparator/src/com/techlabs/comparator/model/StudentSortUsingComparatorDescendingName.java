package com.techlabs.comparator.model;

import java.util.Comparator;

public class StudentSortUsingComparatorDescendingName implements Comparator<Student1>{

	@Override
	public int compare(Student1 student1, Student1 student2) {
		return student2.name.compareToIgnoreCase(student1.name);
	}

}
