package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("pongal.txt");
		
		PrintWriter out=new PrintWriter(fw);
		
		out.write(97);
		out.println(100);
		out.println('c');
		out.flush();
		out.close();
		
		
	}

}