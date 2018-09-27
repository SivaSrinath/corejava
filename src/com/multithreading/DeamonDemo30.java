package com.multithreading;

public class DeamonDemo30 implements Runnable{

	
	Thread th;
	DeamonDemo30(){
		th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run :"+ th.isDaemon());
		for(int i=1; i<=100; i++) {
			System.out.println("Run :"+ i);
		}
	}
}