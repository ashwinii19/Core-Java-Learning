package com.techlabs.threadingusingThread.test;

import com.techlabs.threadingusingThread.model.ThreadingUsingThread;

public class ThreadingUsingThreadtest {

	public static void main(String[] args) throws Exception {
		
		ThreadingUsingThread thread0 = new ThreadingUsingThread();
		thread0.start();
		thread0.run();
		thread0.sleep(2000);
		
		ThreadingUsingThread thread1 = new ThreadingUsingThread();
		thread1.start();
		
		ThreadingUsingThread thread2 = new ThreadingUsingThread();
		thread2.start();
	}

}
