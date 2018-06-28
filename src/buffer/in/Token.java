package buffer.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("enter name, age, salary");
		
		String str=br.readLine();
		// use string tokenizer to split input at comas
		StringTokenizer st=new StringTokenizer(str,",");
		
		
		// we will have 3 tokens first one is name, second one is age, third one is salary 
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
		
		//trim any spaces before and after the spaces
		
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();
		
		//convert s1 into string, s2 into int, s3 into float
		
		String name=s1;
		
		int age= Integer.parseInt(s2);
		float salary= Float.parseFloat(s3);
		
		System.out.println("entered name is" +s1);
		System.out.println("entered age is" +s2);
		System.out.println("entered salary is" +s3);
		

	}

}
