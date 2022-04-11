package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3;
		double avg;
		
		System.out.println("첫번째 정수 입력");
		num1 =scn.nextInt();
		
		System.out.println("두번째 정수 입력");
		num2 =scn.nextInt();
		
		System.out.println("세번째 정수 입력");
		num3 =scn.nextInt();
		
		avg = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("세 정수는%3d, %2d, %2d이고 결과값은%.3f입니다.",num1 ,num2, num3,avg );
		
	}

}
