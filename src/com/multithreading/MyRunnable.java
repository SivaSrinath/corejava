package com.multithreading;

public class MyRunnable implements Runnable{
	
	public void run() {
		System.out.println("run excecuted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		mr.run();
	}

}
