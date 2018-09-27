package com.multithreading1;

public class MyThread extends Thread{
	
	MyThread(){
		super();
	}
	
	MyThread(Runnable target){
		super(target);
	}
	public void run() {
		System.out.println("From MyThread run method");
	}

}
