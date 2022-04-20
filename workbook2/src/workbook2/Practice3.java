package workbook2;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
 
		// while문으로 은행거래 만들기
		
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(run) {
			
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			int menu = scn.nextInt();
			
			
			if(menu == 1) {
				System.out.println("입글할 금액을 입력하시오");
				balance = scn.nextInt();
				sum += balance;
				System.out.println("통장에"+sum+"을 넣었습니다.");
				
				
			}
			else if(menu == 2) {
				
				System.out.println("출금할 금액을 입력하시오");
				int money = scn.nextInt();
				num = balance - money;
				System.out.println("출금한 금액은"+money+"남은 금액"+num);
				
				
			}
			else if(menu == 3) {

				
			}
			else if(menu == 4) {
				run = false;
			}
			
			
			
			
			
		}
	}

}
