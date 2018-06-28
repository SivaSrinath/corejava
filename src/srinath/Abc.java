 package srinath;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("we are in main method class");
		Addsuper s=new Addsuper();
		s.a=10;
		s.b=20;
		s.sum();
		System.out.println("we are in main method last");
		
		s.sub();
		System.out.println("we are after sub");
		
		int d=s.mul();
		System.out.println("the d value is"+d);
		
		System.out.println(s.div());

	}

}
