package com.multithreading;

public class MyThread26 extends Thread{
	
	MyThread26(){
		super();
	}

	MyThread26(String name){
		super(name);
	}
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(getName()+ "i :"+ i);
		}
	}
}

