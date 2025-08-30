package com.techlabs.comparator.model;

import java.util.Comparator;

public class StudentSortUsingComparatorAscendingName implements Comparator<Student1>{

	@Override
	public int compare(Student1 student1, Student1 student2) {
		return student1.name.compareToIgnoreCase(student2.name);
	}

}
