package workbook2;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int balance = 0;
		int sum=0;
		
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1.입금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택>>>>");
	
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) {
				System.out.println("입금하실 금액을 입력하시오");
				balance = Integer.parseInt(scn.nextLine());
				sum += balance;
				System.out.println("입금하신 금액은:"+balance+" 금액: "+sum);
				
			}
			else if(menu == 2) {
				
				System.out.println("출금하실 금액을 입력하시오");
				balance = Integer.parseInt(scn.nextLine());
				if(sum<balance) {
					System.out.println("출금 금액이 잔고보다 큽니다. ");
				}
				else {
				sum -= balance;
				System.out.println("출금 금액: "+balance+" 남은 금액:"+sum);
				}
				
			}
			else if(menu == 3) {
				System.out.println("현재 남아있는 금액은: "+sum);
				
				
			}
			else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
			
			
			
			
			
		}
		
	}

}
