package nt.com.string;

public class FirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		System.out.println("data store in s1 is"+s1);
		
		String s2=new String("hello world sri");
		System.out.println("data stored in s2 is"+s2);
		
		char arr[]={'c','h','a','i','r'};
		String s3=new String(arr);
		System.out.println("data stored in s3\t"+s3);
		String s4=new String(arr,2,2);
		System.out.println(s4);
		
		String s5= "nath";
		String s6= s2.concat(s5);
		System.out.println("data store in s6\t"+s6);
		

	}

}
