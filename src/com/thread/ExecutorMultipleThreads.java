package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMultipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside : "+ Thread.currentThread().getName());
		System.out.println("Creating executor service...");
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task1 = () -> {
			System.out.println("Executing task1 inside :" + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};
		
		Runnable task2 = () ->{
			System.out.println("Executing task 2 inside :" + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};
		
		Runnable task3 = ()->{
			System.out.println("Executing task 3 inside :" + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};
		
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.execute(task1);
		executorService.submit(task3);
		
		executorService.shutdown();
	}

}
