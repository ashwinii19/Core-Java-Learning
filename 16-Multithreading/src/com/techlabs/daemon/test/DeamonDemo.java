package com.techlabs.daemon.test;

public class DeamonDemo {

		public static void main(String[] args) {
			Thread daemonthread = new Thread(() -> {
	            while (true) {
	                System.out.println("Daemon thread is working...");
	                try {
	                    Thread.sleep(1000); // Sleep 1 second
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
			daemonthread.setDaemon(true);

		        // Start the thread
		        daemonthread.start();

		        // Main thread work
		        System.out.println("Main thread is doing work...");
		        try {
		            Thread.sleep(3000); // Main thread sleeps for 3 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Main thread is done!");
	     }
		
}
