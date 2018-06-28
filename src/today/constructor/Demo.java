package today.constructor;

public class Demo {

	Demo(){
		System.out.println("phani");		
	}
	Demo(int x){
		System.out.println("one argument"+x);
	}
	
	Demo(int x, int y){
		System.out.println("one value"+x+"\tsecond value"+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// need to create an object
		Demo d= new Demo();
		Demo d2= new Demo(10);
		Demo d3= new Demo(40,50);
		
		Test t=new Test();
		Test t1=new Test(2);
		Test t2=new Test(2, 3.0);

	}
	static{
		System.out.println("hello world");
	}

}
