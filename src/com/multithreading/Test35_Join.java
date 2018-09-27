package com.multithreading;

public class Test35_Join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("main start");
		
		MyThread35 mt= new MyThread35();
		
		mt.start();
		mt.join(15000);
		
		System.out.println("main end");
	}
}
