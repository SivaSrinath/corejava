package com.wrapper;

public class String2Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean bo1 = new Boolean("false");	System.out.println("bo1"+ bo1);
		Boolean bo2 = new Boolean("true");	System.out.println("bo2"+ bo2);
		
		Boolean bo3 = Boolean.valueOf("FalSe"); System.out.println("bo3"+ bo3);
		
		Boolean bo4 = Boolean.valueOf("srinath"); System.out.println("bo4"+ bo4);
		
		Boolean bo5 = Boolean.valueOf("True"); System.out.println("bo5"+ bo5);
		
		
	}

}
