package com.java8.MethRef;

public class MethodReference2 {

	public static void ThreadStatus(){
		System.out.println("Thread is running..");
	}
	public static void main(String[] args) {
		
		Thread td = new Thread(MethodReference2::ThreadStatus);
		td.start();

	}

}
