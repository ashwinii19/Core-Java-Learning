package com.techlabs.StudentPerformanceManagementSystemproject.model;

public class ArtsStudent extends Student {

	int history;
	int politicalScience;
	int sociology;

	public ArtsStudent(String name, int rollNumber, String stream, int history, int politicalScience, int sociology) {
		super(name, rollNumber, stream);
		this.history = history;
		this.politicalScience = politicalScience;
		this.sociology = sociology;
	}

	@Override
	public double calculatePerformance() {
		return (history + politicalScience + sociology) / 3;
	}
	
	public String displayGrade(double performance) {
		if (performance >= 90 && performance <= 100 ) {
			return "A";
		} else if (performance >= 75 && performance <90) {
			return "B";
		} else if (performance >= 60 && performance < 75) {
			return "C";
		} else if (performance >= 35 && performance < 60){
			return "D";
		}else {
			return "E";
		}
	}

	@Override
	public void displayInfo() {
		System.out.println("----------------------------------------");
		System.out.println("Name: " + name + " | Stream: " + stream + " | Roll Number: "+ rollNumber+ " \nSubjects: History " + history + ", Political Science " + politicalScience+ ", Sociology " + sociology + "\nPerformance: " + calculatePerformance() + " | Grade: "+displayGrade(calculatePerformance()));	
		System.out.println("");
	}
}
