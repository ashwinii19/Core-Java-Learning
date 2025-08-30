package com.techlabs.StudentPerformanceManagementSystemproject.model;

public  class CommerceStudent extends Student {

	int accounts;
	int businessStudies;
	int economics;

	public CommerceStudent(String name, int rollNumber, String stream, int accounts, int businessStudies, int economics) {
		super(name, rollNumber, stream);
		this.accounts = accounts;
		this.businessStudies = businessStudies;
		this.economics = economics;
	}

	@Override
	public double calculatePerformance() {
		return(accounts + businessStudies + economics) / 3;
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
		System.out.println("Name: " + name + " | Stream: " + stream + " | Roll Number: "+ rollNumber+ " \nSubjects: Accounts " + accounts + ", Business Studies " + businessStudies+ ", Economics " + economics + "\nPerformance: " + calculatePerformance() + " | Grade: "+displayGrade(calculatePerformance()));
		System.out.println("");
	}
}
