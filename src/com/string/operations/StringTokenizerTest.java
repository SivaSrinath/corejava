package com.string.operations;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st= 
			//	new StringTokenizer("Siva Srinath");
			 // new StringTokenizer("Siva Srinath", "a");
			  new StringTokenizer("Sivat Srinath", "a", true);
		System.out.println("Number of Tokens :"+ st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}	

	}

}
