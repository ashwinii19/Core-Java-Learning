package com.techlabs.threadingusingThread.model;

public class PriorityDemo extends Thread {

	public PriorityDemo(String name, int priority) {
		setName(name);
		setPriority(priority);
	}

	@Override
	public void run() {
		for(int i=0; i<=5; i++){
			System.out.println(getName() + " is running "+getPriority());
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
