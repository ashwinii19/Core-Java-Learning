package com.techlabs.comparator.model;

import java.util.Comparator;

import com.techlabs.comparable.model.Student;

public class StudentSortUsingComparatorAscendingID implements Comparator<Student1> {

	@Override
	public int compare(Student1 student1, Student1 student2) {
		return student1.id - student2.id;	
	}


	
}
