package nt.com.string;

public class SecondStrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1=new StringBuffer("hello");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer();
		s2.append("I am in virginia now");
		//System.out.println(s2);
		//s2.append("I love ");
		
		//s2.substring(0,2);
		System.out.println(s2);
		s2.append("connecticut");
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("Bridge");
		s3.append("port");
		System.out.println(s3);
		s3.insert(4, "groom");
		System.out.println(s3);
		
		StringBuffer s4=new StringBuffer("This is a java class");
		int n=s4.indexOf("is");
		System.out.println(n);
		int n1=s4.lastIndexOf("j");
		System.out.println(n1);
		
		s4.replace(0, 4, "today");
		System.out.println(s4);
		
		String s=s2.substring(4);
		System.out.println("substring is \t"+s);
	}

}
