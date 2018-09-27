package com.multithreading;

public class MyThread14 extends Thread{
	
	public void run() {
		System.out.println(getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread14 mt1= new MyThread14();
		mt1.start();
		
		MyThread14 mt2= new MyThread14();
		mt2.start();
		
		MyThread14 mt3= new MyThread14();
		mt3.start();

	}

}
