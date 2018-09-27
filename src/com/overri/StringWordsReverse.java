package com.overri;

public class StringWordsReverse {
	
	
	public static String reverseStringWords(String s) {
		String[]   stringWords = s.split(" ");
		int noOfWords = stringWords.length;
		
		StringBuffer sb= new StringBuffer();
		
		for(int i=noOfWords-1; i>=0;i--) {
			sb.append(stringWords[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseStringWords("how are you"));

	}

}
