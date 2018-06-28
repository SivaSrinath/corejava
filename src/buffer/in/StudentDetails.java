package buffer.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDetails {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("enter ID");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter m/f");
		char sex=(char)br.read();
		
		System.out.println("entered ID is"+id);
		System.out.println("entered name is"+name);
		System.out.println("entered sex is"+sex);
		

	}

}
