package com.interview;

import java.util.HashMap;

public class OracleInterview {
	
	//find the unique characters in a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		characterCount("srinaths");

	}
	
	public static void characterCount(String str) {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = str.toCharArray();
		
		for(char c: strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,  charCountMap.get(c)+1);
			}else {
				charCountMap.put(c,  1);
			}
		}
		
		charCountMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
	}

}
