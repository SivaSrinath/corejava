package com.IOFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRFRDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("E:\\corejava\\corejavabooks\\Files\\abc.txt"));
		System.out.println(br);
		String line;
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}

	}

}
