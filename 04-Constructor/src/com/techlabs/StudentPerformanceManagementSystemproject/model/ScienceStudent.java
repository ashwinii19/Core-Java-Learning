package com.techlabs.StudentPerformanceManagementSystemproject.model;

public  class ScienceStudent extends Student {

	int physics;
	int chemistry;
	int math;
	
	public ScienceStudent(String name, int rollNumber, String stream, int physics, int chemistry, int math) {
		super(name, rollNumber, stream);
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
	}
	
	@Override
	public double calculatePerformance() {
		return (physics + chemistry + math) / 3;
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
		System.out.println("Name: " + name + " | Stream: " + stream + " | Roll Number: "+ rollNumber+ " \nSubjects: Physics " + physics + ", Chemistry " + chemistry+ ", Math " + math + "\nPerformance: " + calculatePerformance() + " | Grade: "+displayGrade(calculatePerformance()));
		System.out.println("");
	}

}
