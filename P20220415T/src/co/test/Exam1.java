package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("num1를 입력하시오");
		int num1 = scn.nextInt();
		System.out.println("num2를 입력하시오");
		int num2 = scn.nextInt();
		System.out.println("num3를 입력하시오");
		int num3 = scn.nextInt();
		

		int max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max =num3;
		System.out.println("가장 큰값은"+ max);
		
		
	}
}
