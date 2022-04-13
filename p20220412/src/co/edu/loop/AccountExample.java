package co.edu.loop;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while(run) {
			
		System.out.println("---------------------------------");	
		System.out.println("1.예금 2.출금 3.조회 4.종료");	
		System.out.println("---------------------------------");
		System.out.println("선택>>>>");
		int menu = scn.nextInt();
		
		if(menu ==1) {
			System.out.print("예금액>>");
			int money = scn.nextInt();
			balance += money;
		}
		
		else if(menu ==2) {
			System.out.print("출금액>>");
			int money = scn.nextInt();
			if(balance <=money) {
				System.out.print("돈이 부족"+"\n");
				continue;
			}
			
			balance -= money;
			
			}
		
		else if(menu==3) {
			System.out.print("잔고>>"+balance+"\n");
		}
		else if(menu == 4) {
			System.out.print("안녕히가세요");
			run = false;
		}
		else {
			System.out.print("잘못된 메뉴 선택");
		}
		
		
		}
		
		System.out.println("프로그램 종료.");
	}

}
