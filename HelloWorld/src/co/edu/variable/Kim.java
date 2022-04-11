package co.edu.variable;

import java.util.Scanner;

public class Kim {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3,sum1,maxValue;
		double avg;
		
		System.out.println("정수를 입력하시오");
		num1 = scn.nextInt();
		System.out.println("정수를 입력하시오");
		num2 = scn.nextInt();
		System.out.println("정수를 입력하시오");
		num3 = scn.nextInt();
		
		sum1 = num1+num2+num3;
		avg = sum1/3.0;
		
		maxValue = num1;
		if(maxValue < num2) {
		maxValue = num2;
		}
		if(maxValue < num3) {
			maxValue = num3;
		}

		
		System.out.printf("합은%d 평균은%.1f이고 최고값은%3d",sum1 ,avg, maxValue);
		
	
	}

	}


