package com.techlabs.candidate.model;

import java.util.Comparator;

public class CandidateSortAscendingName implements Comparator<Candidate> {

	@Override
	public int compare(Candidate candidate1, Candidate candidate2) {
		int nameCompare = candidate1.name.compareToIgnoreCase(candidate2.name);
		if(nameCompare !=0 ) {
			return nameCompare;
		}
		else {
			return Integer.compare(candidate1.age, candidate2.age);
		}
		
	}

}
