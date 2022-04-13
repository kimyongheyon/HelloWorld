package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		//math random 생성범의 1~10 = randomVal
		//사용자 입력값을 담는 변수 userVal.
		//while 구문을 사용해서 임의의 값이랑 입력값이 같으면 종료
		Scanner scn = new Scanner(System.in);

		int randomVal = (int)(Math.random() * 10)+1;
		
		
		
		while(true) {
			   System.out.println("원하는 숫자를 입력해주세요!!");
				int userVal = scn.nextInt();
			if(randomVal == userVal) {
				System.out.println("정답");
			}else if(randomVal > userVal) {
				System.out.println("숫자가 더 큽니다");
				break;
			}
			else {
				System.out.println("숫자는 더 작습니다.");
			}
		}
		
		
	
	}

}
