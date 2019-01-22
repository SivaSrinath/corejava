package com.multithreading1;

public class Test03_RunExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("case 1");
		Thread th1=new Thread();
		th1.start();
		
		/*System.out.println("******case 2******");
		MyThread mt= new MyThread();
		mt.start();
		
		System.out.println("**** case 3******");
		MyRunnable mr= new MyRunnable();
		//mr.start();
		
		System.out.println("***** case 4*****");
		Thread th2 = new Thread(mr);
		th2.start();*/
		
		/*System.out.println("***case 5****");
		MyThread mt1= new MyThread();
		Thread th3 = new Thread(mt1);
		th3.start();*/
		
		/*System.out.println("**case 6***");
		Thread th4 = new MyThread();
		th4.start();*/
		
		/*System.out.println("****case 7*****");
		Thread r = new MyRunnable();
		r.start();*/
		
		/*System.out.println("*** case 8****"); 
		Runnable r = new MyRunnable();
		
		System.out.println("*** case 9 ****");
		Thread th6= new Thread(r);
		th6.start();*/
		
		/*System.out.println("** case 10*****");
		Runnable r= new MyThread();
		
		System.out.println("*** case 11***");
		Thread th7 = new Thread(r);
		th7.start();*/
		
		/*System.out.println("** case 12***");
		MyRunnable mr2= new MyRunnable();
		MyThread mt2= new MyThread();
		mt2.start();*/
		
		
	}
}