package com.techlabs.threadingusingThread.model;

public class ThreadingUsingThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
