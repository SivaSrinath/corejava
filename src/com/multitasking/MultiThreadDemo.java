package com.multitasking;

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t= new MyThread();
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("main thread"+ i);
		}

	}

}
