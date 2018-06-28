package com.multitasking;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread();
		t.start();
		for(int i=0; i<=10; i++){
			System.out.println("main method");
		}

	}

}
