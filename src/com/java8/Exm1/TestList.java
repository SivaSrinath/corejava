package com.java8.Exm1;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li =new ArrayList<Integer>();
		
		li.add(49);
		//li.add(40);
		//li.add(50);
		//li.add(70);
		
		li.forEach(n-> System.out.println(n));
		System.out.println("**************************");
		li.forEach(n-> {if (n%2 == 0) System.out.println(n); });

	}

}
