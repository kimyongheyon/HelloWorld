package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {

//		
//		for(int j=2; j <=9; j++) {
//		for(int i=1; i<=9; i++) {
//			System.out.println( j +"*"+ i+"="+(j*i));		
//			}
//	}
//		

		for (int j = 1; j <= 5; j++) {
			for (int i =5; i >=1; i--) {
				if(j<i) {
					System.out.print(" ");
				}else {
					
				
				System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
