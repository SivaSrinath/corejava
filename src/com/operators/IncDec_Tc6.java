package com.operators;

public class IncDec_Tc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i++ <= 4) {
			System.out.println(i + "->Hello");
		}
		System.out.println("After loop i:"+ i);
		System.out.println();
		i=1;
		while(++i <= 4) {
			System.out.println(i+ "=>Hello");
		}
		System.out.println("after loop i" +i);
	}

}