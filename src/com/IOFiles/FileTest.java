package com.IOFiles;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("E:\\corejava\\corejavabooks\\Files");
		//file.separator
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.toURI());
		System.out.println(file.toURI());
		System.out.println("\"Siva\"");
		System.out.println("\"   \"");

	}

}
