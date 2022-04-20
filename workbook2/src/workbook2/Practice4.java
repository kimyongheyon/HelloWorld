package workbook2;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (double)(lengthTop + lengthBottom)*2.0 /2;
		System.out.println(area);
		
		
		
		Scanner scn = new  Scanner(System.in);
		
		double num1 = scn.nextDouble();
		double num2 = scn.nextDouble();
		
		double result = num1/num2;
		
		System.out.println(result);
		
	}

}
