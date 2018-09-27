package com.exception.exc;

public class InnerTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("enter a value");
			int a = Integer.parseInt(args[0]);
			System.out.println("a :"+ a);
			try {
				int x[]= new int[a];
				System.out.println("array size :"+ x.length);
			}catch(NegativeArraySizeException nas){
				int x[]= new int[3];
				System.out.println("array size :"+ x.length);
			}
			int b= a+20;
			System.out.println("b :"+ b);
		}catch(NumberFormatException nfe) {
			System.out.println("pass only int value");
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("pass one int value");
		}
	}

}
