package today.constructor;

public class Test {
	
	Test(){
		System.out.println("Test 0");
	}
	Test(float x){
		System.out.println("Test 1\t"+x);
	
	}
	Test(int x, double y){
		System.out.println("Test 2\t"+x+"second value is"+y);
	}

}
