package buffer.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("enter character");
		
		char ch=(char) br.read();
		
		System.out.println("you entere is "+ch);
	
		System.out.println("enter string value");
		//ASCII-- a-97 b-98, A-65, B-66
		
		String str=br.readLine();
		System.out.println("yoe entered "+str);
	
		

	}
}