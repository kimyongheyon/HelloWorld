package co.edu.dimension;

public class ArrayExample {

	public static void main(String[] args) {

		int[][] intAry = new int[4][3];

		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;

		for(int j =0; j<intAry.length; j++) {
		for (int i = 0; i < intAry[j].length; i++) {
             System.out.print("["+j+"]"+"["+i+"]"+"==>"+intAry[j][i]);
		}
		System.out.println();
		}
		
		int[][] num = new int[5][5];
		int a =1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				num[i][j] = a++; 
				System.out.printf("%3d",num[i][j]);
				
			}
			System.out.println();
		}
		
		
	}

}
