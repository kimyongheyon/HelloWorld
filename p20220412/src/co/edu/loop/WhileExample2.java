package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
        Scanner scn =new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		//200이 넘게 되면 반복문 빠져나오도록
		while(isTrue) {
			System.out.println("더할 숫자를 입력하시오");
			int tempo = scn.nextInt();
			sum+=tempo;
			if(sum>=200) {
			System.out.println("더한 값이 200을 넘기면 자동종료");
			isTrue =false;
			}
			
			
			
		}
		
		System.out.println("결과: "+ sum);
		
	}

}
