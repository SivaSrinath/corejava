package com.IOFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBufferedIOS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis1 = new FileInputStream("E:\\corejava\\corejavabooks\\Files\\input1.txt");
		FileInputStream fis2 = new FileInputStream("E:\\corejava\\corejavabooks\\Files\\input2.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		int data;
		while((data = sis.read())!= -1) {
			System.out.print((char)data);
		}
		
	}

}
