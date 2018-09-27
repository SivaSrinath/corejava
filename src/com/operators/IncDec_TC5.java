package com.operators;

public class IncDec_TC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		int y= x++ + ++x + x++;
		System.out.println("x ***:"+ x);
		System.out.println("y :"+ y);
		System.out.println();
		
		System.out.println(true && true);
		System.out.println(true || true);
		System.out.println(false || false);

	}

}