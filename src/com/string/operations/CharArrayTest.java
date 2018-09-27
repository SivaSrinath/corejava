package com.string.operations;

import java.util.Arrays;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Siva0";
		char[] ch1= s1.toCharArray();
		byte[] b1= s1.getBytes();
		
		System.out.println("s1 :"+ s1);
		System.out.println("ch1" + Arrays.toString(ch1));
		System.out.println("b1 :"+ Arrays.toString(b1) );

	}

}
