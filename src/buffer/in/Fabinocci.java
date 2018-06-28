 package buffer.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fabinocci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter how many fabinocci series0");
		int n=Integer.parseInt(br.readLine());
		
		long f1=0,f2=1;
		
		System.out.println(f1);
		System.out.println(f2);

		long f=f1+f2;
		
		System.out.println(f);

		int count=5;
		
		while(count<n){
			f1=f2;
			f2=f;
			f=f1+f2;
			System.out.println(f);
			count++;
		} 
	}

}
