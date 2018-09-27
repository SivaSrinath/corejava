package com.IOFiles;

import java.io.IOException;

public class ReadDataFromKeyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter data:");
		
		int data= System.in.read();
		
		System.out.println("You entered :"+ (char)data);

	}

}
