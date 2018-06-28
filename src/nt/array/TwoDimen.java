package nt.array;

public class TwoDimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}};
		//enter in a matrix form
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		/*float x[][]={{1.1f, 1.2f, 1.3f,1.4f},
				{2.1f,2.2f,2.3f,2.4f},
				{3.1f,3.2f,3.3f,3.4f}};
		
		System.out.println("In matrix form");

		 for(int i=0; i<3; i++){//rows
			 for(int j=0; j<4; j++){//columns
				 System.out.print(x[i][j]+"\t");
			 }
			 System.out.println();
		 }
*/
	}

}