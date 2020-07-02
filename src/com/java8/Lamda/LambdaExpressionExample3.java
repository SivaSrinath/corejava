package com.java8.Lamda;

import com.java8.Lamda.interfac.Sayable;

//Java Lambda Expression Example: No Parameter
public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		
		Sayable s = ()->{
			return "LambdaExpressionExample3 with no parameter";
		};
		System.out.println(s.sayable());
	}
}