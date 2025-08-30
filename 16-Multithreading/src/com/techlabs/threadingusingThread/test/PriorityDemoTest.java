package com.techlabs.threadingusingThread.test;

import com.techlabs.threadingusingThread.model.PriorityDemo;

public class PriorityDemoTest {

	public static void main(String[] args) {
		
//		PriorityDemo thread0 = new PriorityDemo();
//		thread0.setPriority(Thread.MAX_PRIORITY);
//		
//		PriorityDemo thread1 = new PriorityDemo();
//		thread1.setPriority(Thread.MIN_PRIORITY);
//		
//		PriorityDemo thread2 = new PriorityDemo();
//		thread2.setPriority(Thread.NORM_PRIORITY);
		
		
//		PriorityDemo thread0 = new PriorityDemo();
//		thread0.setName("Alpha");
//		thread0.setPriority(9);
//		thread0.start();
//		
//		PriorityDemo thread1 = new PriorityDemo();
//		thread0.setName("Beta");
//		thread1.setPriority(3);
//		thread1.start();
//		
//		PriorityDemo thread2 = new PriorityDemo();
//		thread0.setName("Gamma");
//		thread2.setPriority(2);
//		thread2.start();
		
		
		new PriorityDemo("Alpha", 9).start();
		
		new PriorityDemo("Beta", 3).start();
		
		new PriorityDemo("Gamma", 2).start();
	}
}
