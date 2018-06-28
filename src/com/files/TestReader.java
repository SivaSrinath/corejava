package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("program.txt");
		FileReader fr=new FileReader(f);
		System.out.println(fr.read());
		
		char[] ch2=new char[(int)(f.length())];
		
		System.out.println(ch2.length);
		fr.read(ch2);
		for(char ch:ch2){
			System.out.println(ch);
		}
		

	}

}
