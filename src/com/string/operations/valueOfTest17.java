package com.string.operations;

public class valueOfTest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("10 \t"+String.valueOf(10));
		System.out.println("a\t"+String.valueOf('a'));
		System.out.println("10.67\t"+String.valueOf(10.67));
		System.out.println("true\t"+String.valueOf(true));
		
		System.out.println("abc\t"+String.valueOf("abc")		);
		System.out.println("{a, b}\t"+String.valueOf(new char[] {'a','b'}));
		//System.out.println("null \t"+String.valueOf(null));
		System.out.println("string of null \t"+String.valueOf((String)null));

		System.out.println(Integer.toString(10));
	}

}
