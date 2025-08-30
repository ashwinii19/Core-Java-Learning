package com.techlabs.executionservice.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 1; i <= 5; i++) {
			Callable<String> task = () -> {
				return "Task executed " + Thread.currentThread().getName();
			};
			Future<String> result = service.submit(task);
			System.out.println(result.get());
			Thread.sleep(2000);
		}

		service.awaitTermination(2, TimeUnit.SECONDS);
		service.shutdown();
	}
}
