package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("progr.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s !=null){
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
		
		

	}

}
