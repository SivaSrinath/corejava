package nt.com.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="A book is on the table";
		String s2=new String("srinath");
		char arr[]={'v','i','r','g','i','n','i','a'};
		String s3= new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("length of the string s1 \t"+s1.length());//finding the length of string
		//concatenation of two strings
		System.out.println("s1 with s2\t"+s1.concat(s2));
		
		//substrings
		String p=s2.substring(0,3);
		System.out.println("substring of s2 is\t"+p);
		
		String q=s3.substring(0,4);
		System.out.println("substring of s3 is\t"+q);
		
		System.out.println(p+q);
		
		boolean x=s1.startsWith("A");
		if(x)
			System.out.println("s1 starts with A");
		else
			System.out.println("s1 is not starts with A");
		
		boolean z=s1.endsWith("e");
		if(z)
			System.out.println("s1 ends with e");
		else
			System.out.println("s2 is not ends with e");
		
		
	}

}
