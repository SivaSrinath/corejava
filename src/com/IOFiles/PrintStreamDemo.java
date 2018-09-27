package com.IOFiles;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintStream ps = new PrintStream("E:\\corejava\\corejavabooks\\Files\\abc.txt");
		
		ps.print("a");
		ps.print(1);
		ps.println(12345);
		
		
		

	}

}
