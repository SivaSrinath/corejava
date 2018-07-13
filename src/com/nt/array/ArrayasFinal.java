package com.nt.array;

public class ArrayasFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ia[]= new int[5];
		
		// modifying array location values
		ia[1]=5;
		ia[2] = 6;
		
		//modifying array referenced values
		//ia= new int[6];
		
		//printing array referenced location values
		for(int i=0; i<ia.length; i++) {
			System.out.println("ia [" +i+ "]-->"+ ia[i]);
		}
		
	}
}
