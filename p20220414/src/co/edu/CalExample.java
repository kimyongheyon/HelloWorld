package co.edu;

public class CalExample {

	public static void main(String[] args) {

		Calculator c1 =new Calculator();
		
		c1.printPi();
		c1.getArea(2.4);
		
		int result = c1.sum(6, 7);
		System.out.println("두수의 합 "+result);
		double result1 = c1.sum(23.4,35.1);
	    
		
		double result2 = c1.getTriangleArea(25,13.1);
		System.out.println("삼각형의 넓이는"+result2);
		
		
		int[] intAry = {10, 20, 30, 40};
		int result3 = c1.sum(intAry);
		System.out.println("배열의 합"+result3);
		
		
		result1 = c1.average(10, 20,25 );
		System.out.println(result1);
		
		result1 = c1.average(10,20,30, 33, 22, 55 );
		System.out.println(result1);
		
	}    

}
