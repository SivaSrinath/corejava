package com.files;

import java.io.File;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());

		try{ 
			f.createNewFile();
			System.out.println(f.exists());	
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
