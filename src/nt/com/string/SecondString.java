package nt.com.string;

public class SecondString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello this is a book on java";
		char arr[]= new char[20];
		str.getChars(7, 19, arr, 3);
		//str.getChars(srcBegin, srcEnd, dst, dstBegin);
		System.out.println(arr);

		//split string
		String s1="Hello, this is a book on java";
		String s[];
		
		s=s1.split(" ");
		
		for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
		
		
	}

}
