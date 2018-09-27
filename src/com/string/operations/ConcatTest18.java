package com.string.operations;

public class ConcatTest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="siva";
		System.out.println(s1.concat("srinath"));
		
		String s2= String.join("-", "a","b");
		System.out.println("s2"+ s2);
		String s3= String.join("  ", "a","b","c","d");
		System.out.println("s3"+ s3);
		String s4= String.join("-", new StringBuffer("b"),new StringBuffer("c"));
		System.out.println("s4"+ s4);
		
		String s5= "a"+"b"+"c";
		System.out.println("s5"+ s5);
		String s6= "a".concat("b").concat("c").concat("d");
		System.out.println("s6"+s6);
		
		String s7="aBc";
		System.out.println("s7"+s7.toUpperCase());
		
		

	}

}
