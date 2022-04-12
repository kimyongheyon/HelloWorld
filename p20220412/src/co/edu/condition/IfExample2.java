package co.edu.condition;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = scn.nextInt();
		
		// 2의 배수, 3의 배수, 2,3의 공통배수인지
		
		if((num1 % 2== 0) && (num1 % 3 == 0) ) {
			System.out.println("2,3의 공통배수입니다");
		}else if(num1 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else if(num1 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
