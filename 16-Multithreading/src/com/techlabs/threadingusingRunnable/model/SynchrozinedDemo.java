package com.techlabs.threadingusingRunnable.model;

public class SynchrozinedDemo implements Runnable {

	public int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			increment();
		}
		
	}

}
