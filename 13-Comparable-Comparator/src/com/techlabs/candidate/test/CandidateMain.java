package com.techlabs.candidate.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.candidate.model.Candidate;
import com.techlabs.candidate.model.CandidateSortAscendingName;

public class CandidateMain {

	public static void main(String[] args) {
		
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate("Ashwini", 22));
		candidates.add(new Candidate("Durgesh", 22));
		candidates.add(new Candidate("Aditi", 23));
		candidates.add(new Candidate("Jayesh", 20));
		
		Collections.sort(candidates, new CandidateSortAscendingName());
		
		for(Candidate candidate: candidates) {
			System.out.println(candidate);
		}
	}
}
