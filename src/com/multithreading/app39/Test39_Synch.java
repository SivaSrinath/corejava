package com.multithreading.app39;

public class Test39_Synch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case 1: sharing same object
		
		/*PrintNumbers pn= new PrintNumbers();
		MyThread mt1= new MyThread(pn);
		MyThread mt2= new MyThread(pn);
		
		mt1.start();
		mt2.start();
		System.out.println("main end");*/
		
		//case 2: 
		PrintNumbers pn1= new PrintNumbers();
		PrintNumbers pn2= new PrintNumbers();
		
		MyThread mt1= new MyThread(pn1);
		MyThread mt2= new MyThread(pn2);
		
		mt1.start();
		mt2.start();
		System.out.println("main end");
		

	}

}
