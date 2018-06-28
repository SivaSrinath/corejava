package com.exception;

import java.io.IOException;

public class SamThrowDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SamThrow.demo();
		
		SamThrow dd=new SamThrow();
		dd.accept();
		dd.display();
		

	}

}
