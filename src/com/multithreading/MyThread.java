package com.multithreading;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("I am in run method");
		for(int i=20; i>=1; i--) {
			System.out.println("run method i :"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt = new MyThread();
		mt.start();
		for(int i=1; i<=20; i++) {
			System.out.println("main method i :"+i);
		}
	}
}