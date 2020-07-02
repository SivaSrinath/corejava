package com.multithreading;

public class DeadLockDemo implements Runnable{

	FirstClass fc = new FirstClass();
	
	SecondClass sc = new SecondClass();
	
	DeadLockDemo(){
		
		Thread th = new Thread(this, "Racing Thread "); 
		th.start();
		
		fc.firstClassMethod(sc); //racing thread locked fc object
		System.out.println("Back in main method");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sc.secondClassMethod(fc); //Racing thread locked sc object
		System.out.println("Back in our thread");
	}
}
