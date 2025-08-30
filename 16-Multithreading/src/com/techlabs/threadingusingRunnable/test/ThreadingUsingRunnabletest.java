package com.techlabs.threadingusingRunnable.test;

import com.techlabs.threadingusingRunnable.model.ThreadingUsingRunnable;

public class ThreadingUsingRunnabletest {

	public static void main(String[] args) {
		
		Thread thread0 = new Thread(new ThreadingUsingRunnable());
		thread0.start();
		thread0.run();
		
		Thread thread1 = new Thread(new ThreadingUsingRunnable());
		thread1.start();
		thread1.run();
	}
}
