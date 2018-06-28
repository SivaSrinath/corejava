package nt.array;

import java.io.IOException;
import java.util.Scanner;

public class SecondArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter how many values");
		//int n=Integer.parseInt(br.readLine());
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many subjects");
		int n=s.nextInt();
		
		int[] marks= new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter marks"+i);
			//marks[i]=Integer.parseInt(br.readLine());
			marks[i]=s.nextInt();
			System.out.println("marks array"+marks[i]);
			
		}
		int tot=0;
		for(int j=0;j<n;j++){
			tot=tot+marks[j];
		}
		System.out.println("total marks value is"+tot);
		
		double avg;
		avg=tot/n;
		System.out.println("average value is"+avg);
	}

}
