package com.java8.Lamda;


//Java Lambda Expression Example: Creating Thread
public class LambdaExpressionExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Thread Example without lambda  
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I am in thread 1");
			}
		};

		Thread th = new Thread(r);
		th.start();
		
		//Thread Example with lambda
		
		Runnable r1 = () ->{
			System.out.println("I am in thread 2");
		};
		
		Thread th1 = new Thread(r1);
		
		th1.start();
	}

}
