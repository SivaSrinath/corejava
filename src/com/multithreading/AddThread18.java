package com.multithreading;

public class AddThread18 extends Thread{
	
	int sum=0;
	public void run() {
		for(int i=1; i<=50; i++) {
			sum +=i;
			System.out.println("the summation :"+ sum);
		}
	}

}
