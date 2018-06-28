package buffer.in;

import java.util.Scanner;

public class ScanJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter ID number");
		int id=sc.nextInt();
		
		System.out.println("enter salary");
		float sal=sc.nextFloat();
		
		System.out.println("entered name is"+name);
		System.out.println("entered id number is"+id);
		System.out.println("entered salary is"+sal);
		System.out.println("*************");		
		System.out.printf("entered %s",name);
		System.out.printf("/n entered %d",id);
		System.out.printf("/n entered salary is %f",sal);
		

	}

}
