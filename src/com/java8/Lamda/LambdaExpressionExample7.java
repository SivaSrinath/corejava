package com.java8.Lamda;

import java.util.ArrayList;
import java.util.List;

//Java Lambda Expression Example: Foreach Loop
public class LambdaExpressionExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Cricket");
		list.add("Aditya");
		list.add("Karthik");

		list.forEach( n -> System.out.println(n));
	}
}