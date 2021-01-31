package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Inside : "+ Thread.currentThread().getName());
		System.out.println("Creating executor service...");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		System.out.println("Creating a runnable...");
		
		Runnable runnable = () ->{
			System.out.println("Inside : "+ Thread.currentThread().getName());
		};

		System.out.println("Submit the task specified by the runnable to the executor service.");
		executorService.submit(runnable);
		
		Callable<Integer> c = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		Future<Integer> f = executorService.submit(c);
		f.get();
		System.out.println("Shutting down the executor");
		executorService.shutdown();
	}
}
