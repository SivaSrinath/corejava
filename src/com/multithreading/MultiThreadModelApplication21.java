package com.multithreading;

public class MultiThreadModelApplication21 extends Thread{
	
	static PrintNumbers20 pn= new PrintNumbers20();
	
	public void run() {
		pn.print50To1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadModelApplication21 mt = new MultiThreadModelApplication21();
		
		long time1= System.currentTimeMillis();
		
		mt.start();
		
		pn.print1To50();
		
		long time2= System.currentTimeMillis();
		
		System.out.println("time take to complete both tasks"+ ((time2-time1)/1000) +"secs");
	}

}
