package com.multithreading;

public class MyThread35 extends Thread{
	
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}

}
