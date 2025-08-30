package com.techlabs.comparator.model;

import java.util.Comparator;

public class StudentSortUsingCamparatorDescendingID implements Comparator<Student1>{

	@Override
	public int compare(Student1 student1, Student1 student2) {
		return student2.id - student1.id;
	}

}
