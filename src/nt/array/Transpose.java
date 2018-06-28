package nt.array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//acceptes rows, columns of a matrix
		System.out.println("enter r and c values");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		//create an array with size [r][c]
		//int[][] arr=new int[r][c];
		
		int arr[][] =new int[r][c];
		
		//accept a matrix from key board
		System.out.println("enter marix elemetns");
		for(int i=0; i<r; i++){
			for(int j=0; j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("the array values are   ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c;j++){
			System.out.print(arr[i][j]+"\t");
			}
		System.out.println();	
		}
		
		System.out.println("the transopse of matrix is");
		for(int i=0; i<c; i++){
			for(int j=0; j<r;j++){
				System.out.print(arr[j][i]+"    ");
			}
		System.out.println();	
		}


	}

}
