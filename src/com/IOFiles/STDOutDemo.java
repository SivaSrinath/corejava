package com.IOFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class STDOutDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("Hi1");
		System.err.println("Hello 1");
		
		PrintStream ps1= new PrintStream(new FileOutputStream("output.txt"));
		PrintStream ps2= new PrintStream(new FileOutputStream("error.txt"));
		
		System.setOut(ps1);
		System.setErr(ps2);
		
		System.out.println("hi2");
		System.err.println("Hello2");
		int x=10/0;
		System.out.println(x); 
		

	}

}
