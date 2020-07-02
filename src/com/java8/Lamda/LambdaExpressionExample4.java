package com.java8.Lamda;

import com.java8.Lamda.interfac.Drawable4;


//Java Lambda Expression Example: Single Parameter
public class LambdaExpressionExample4 {

	public static void main(String[] args) {
	
			Drawable4 d = name -> {
				return "Hello "+ name;
			};
			
			System.out.println(d.draw("Srinath"));
	}
}