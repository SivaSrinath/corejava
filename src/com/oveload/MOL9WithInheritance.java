package com.oveload;

import java.util.List;

public class MOL9WithInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B9 b=new B9();
		b.m1("a");
		b.m1(10);
		
		System.out.println();
		A9 a=new B9();
		a.m1("a");
		a.m1(10);
		

	}

}
