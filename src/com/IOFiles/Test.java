package com.IOFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileInputStream in= new FileInputStream("E:\\corejava\\corejavabooks\\Files\\Sample.txt");
		
		int i;
		while((i=in.read())!=-1) {
			System.out.println((char)i);
			
			
		}

	}

}
