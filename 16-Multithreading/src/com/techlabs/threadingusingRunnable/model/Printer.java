package com.techlabs.threadingusingRunnable.model;

public class Printer {

	public void print(String doc) {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+ "Started printing: "+doc);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "Finished printing: "+doc);
		}
	}
}
