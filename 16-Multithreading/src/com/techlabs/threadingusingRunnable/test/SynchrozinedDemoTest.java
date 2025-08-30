package com.techlabs.threadingusingRunnable.test;

import com.techlabs.threadingusingRunnable.model.SynchrozinedDemo;

public class SynchrozinedDemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		SynchrozinedDemo counter = new SynchrozinedDemo();
		
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final count value is: "+counter.count);
	}
}
