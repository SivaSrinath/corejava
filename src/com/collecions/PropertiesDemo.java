package com.collecions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Properties p= new Properties();
		p.load(new FileInputStream("E:\\corejava\\corejavabooks\\Filesabc.txt"));
		
		System.out.println("eid :"+ p.getProperty("eid"));
		System.out.println("ename :"+ p.getProperty("ename"));

	}

}
