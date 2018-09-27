package com.multithreading;

public class MyThread19 {
	
	public void run() {
		System.out.println("run");
	}
	
	public void start() {
		System.out.println("I am in start method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		MyThread19 mt= new MyThread19();
		mt.start();
		System.out.println("end main method");
	}

}
