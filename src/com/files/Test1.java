package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("progr.txt");
		FileWriter fw=new FileWriter(f,true);
		System.out.println(f.exists());
		
		fw.write(97);
		fw.write("run\n software \n");
		
		char [] ch1={'a','b','c'};
		
		fw.write(ch1);
		fw.flush();
		fw.close();
		

	}

}
