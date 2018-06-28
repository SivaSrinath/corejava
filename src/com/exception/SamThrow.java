package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SamThrow {
	static void demo(){
		try{
		System.out.println("inside demo()");
		throw new NullPointerException("Exception data");
		
	}catch(NullPointerException ne){
		System.out.println(ne);
		ne.printStackTrace();
	}
	}
	private String name;
	int sno;
	void accept() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		
		//name =br.readLine();
		
		try{
			System.out.println("enter number");
			sno=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			name=br.readLine();
			
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	void display(){
		System.out.println("name"+ name);
		System.out.println("number is ::"+sno);
	}
}
