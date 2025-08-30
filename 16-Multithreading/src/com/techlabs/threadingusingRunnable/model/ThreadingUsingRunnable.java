package com.techlabs.threadingusingRunnable.model;

public class ThreadingUsingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}

}
