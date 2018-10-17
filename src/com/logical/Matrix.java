package com.logical;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {

	  @SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter no of rows");
	  
	  int rows = Integer.parseInt(sc.nextLine());
	  
	  System.out.println("Enter no of columns");
	  int cols= Integer.parseInt(sc.nextLine());
	  
	  int a[][]= new int[rows][cols];
	  
	  for(int i=0; i<rows; i++) {
		  System.out.println();
		  for(int j=0; j<cols; j++) {
			  System.out.println("enter positions "+i+" "+j);
			  a[i][j]=  Integer.parseInt(sc.nextLine());
		  }
	  }
	  for(int i=0; i<a.length;i++) { // represents no of rows
		  for(int j=0; j<a[i].length; j++) { // represents no of columns
			  System.out.print(a[i][j]+ " ");
		  }
		  System.out.println();
	  }
	}
}
