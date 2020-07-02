package com.java8.Lamda;

import com.java8.Lamda.interfac.Drawable4;

//Java Lambda Expression Example: Multiple Statements
public class LambdaExpressionExample8 {

	
	public static void main(String args[]) {
		
		Drawable4 d = (message) -> {
			
			String str = "Hi ";
			
			String str2 = str + message;
			return str2;
		};
		System.out.println(d.draw("Srinath"));
	}
}
