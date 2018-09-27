package com.multithreading;

public class SingleThreadModelApplication20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNumbers20  pn= new PrintNumbers20();
		long time1= System.currentTimeMillis();
		pn.print1To50();
		System.out.println();
		pn.print50To1();
		long time2=System.currentTimeMillis();
		System.out.println("time take to complete both tasks"+ ((time2-time1)/1000) +"secs");
		

	}

}
