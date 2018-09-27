package com.multithreading;

public class Thread237 extends Thread{
	
	Add37 a;
	Thread237(Add37 a){
		this.a=a;
	}
	public void run() {
		a.add(70, 80);
	}
	
}