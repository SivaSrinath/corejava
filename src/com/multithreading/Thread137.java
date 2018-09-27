package com.multithreading;

public class Thread137 extends Thread{
	
	Add37 a;
	Thread137(Add37 a){
		this.a=a;
	}
	public void run() {
		a.add(50, 60);
	}
	
}