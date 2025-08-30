package com.techlabs.executionservice.test;

import java.io.Serial;
import java.security.Provider.Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceRunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service = Executors.newCachedThreadPool(); 
				
		Runnable task1 = () ->{
			System.out.println("Task1 is executed by: "+Thread.currentThread().getName());
		};
		
		Runnable task2 = () ->{
			System.out.println("Task2 is executed by: "+Thread.currentThread().getName());
		};
		
		Runnable task3 = () ->{
			System.out.println("Task3 is executed by: "+Thread.currentThread().getName());
		};
		
		Runnable task4 = () ->{
			System.out.println("Task4 is executed by: "+Thread.currentThread().getName());
		};
		
		Runnable task5 = () ->{
			System.out.println("Task5 is executed by: "+Thread.currentThread().getName());
		};
		
		
		service.submit(task1);
		Thread.sleep(2000);
		service.submit(task2);
		Thread.sleep(2000);
		service.submit(task3);
		service.submit(task4);
		Thread.sleep(2000);
		service.submit(task5);
		
		
		service.awaitTermination(1, TimeUnit.SECONDS);
		service.submit(task5);
		service.shutdown();
	}
}
