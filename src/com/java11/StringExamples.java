package com.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String multiLineString = "  Baeldung helps \n developers \n explore Java.  ";
		
		List<String> lines = multiLineString.lines()
					.filter(line -> !line.isBlank())
					.map(String::strip)
					.collect(Collectors.toList());
		
		lines.forEach(e -> System.out.println(e));
		
		System.out.println(" ".isBlank()); //true
		
		//List sampleList = Arrays.asList("Java", "Springboot");
		//String[] sampleArray= (String[]) sampleList.toArray(String[]::new);
		
				
		List sampleList = Arrays.asList("Java", "Springboot");
		
		String[] strArray =(String[]) sampleList.toArray(String[]::new);
		
		String s12 = String.join("-", "a","b","c");
		
		System.out.println(s12);
		
		StringBuilder sb = new StringBuilder("Srinath");
		
		System.out.println(sb.reverse());
		
		String str = "&".repeat(5);
		System.out.println(str);
		
		
		
		
	}
}
