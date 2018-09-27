package com.string.operations;

import java.util.Arrays;

public class SplitTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Siva Srinath";
		System.out.println(s1);
		
		String[] sa1 = s1.split(" ");
		System.out.println(s1.split(" "));
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		String[] sa2 = s1.split("at");
		//System.out.println(s1.split(" "));
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa2));
		
		System.out.println();
		String[] sa3 = s1.split(".");
		//System.out.println(s1.split(" "));
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa3));
		
		System.out.println();
		String s4 = "aabc aabc";
		String[] sa4 = s4.split("a");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa4));

	}

}
