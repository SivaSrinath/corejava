package com.multithreading.app39;

public class MyThread extends Thread{
	
	PrintNumbers pn;
	MyThread(PrintNumbers pn){
		this.pn=pn;
	}
	public void run() {
		pn.display();
	}
}