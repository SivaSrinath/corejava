package com.java8.Lamda;

import com.java8.Lamda.interfac.Addable;

//Java Lambda Expression Example: with or without return keyword
public class LambdaExpressionExample5 {
	
	public static void main(String args[]) {
		
		// Multiple parameters in lambda expression  
		Addable addable = (a, b) -> (a+b);
		
		System.out.println(addable.add(10, 20));
		
		// Multiple parameters in lambda expression  
		Addable addable2 = (int a,int b) -> (a+b);
		
		System.out.println(addable2.add(100, 200));
		
		// Lambda expression without return keyword.  
		Addable add3 = (a,b) -> (a+b);
		System.out.println(add3.add(1000, 2000));
		
		// Lambda expression with return keyword.
		
		Addable add4 = (a, b)->{
			return a+b;
		};
		
		System.out.println("with return statement "+add4.add(10, 20));
		
	}

}
