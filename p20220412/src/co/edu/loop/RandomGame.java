package co.edu.loop;

import java.util.Scanner;

public class RandomGame {
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			int randomVal = (int)(Math.random()*3)+1;
			System.out.println("1.가위, 2.바위, 3.보 번호를 입력하시오");
			int userVal = scn.nextInt();
			
			
			if(randomVal == 1) {
				System.out.println("가위");
			}else if(randomVal ==2) {
				System.out.println("바위");
			}else {
				System.out.println("보");
			}
			
			
			
			if(userVal == 1) {
				if(randomVal== 3) {
					System.out.println("승리");
					break;
				}else if(randomVal == 2) {
					System.out.println("패배");
				}else {
					System.out.println("무승부");
				}
			}
			if(userVal ==2) {
				if(randomVal == 1) {
					System.out.println("승리");
					break;
				}else if(randomVal  == 3) {
					System.out.println("패배");
				}else {
					System.out.println("무승부");
				}
			}
			if(userVal ==3) {
				if(randomVal == 2) {
					System.out.println("승리");
					break;
				}else if(randomVal ==1) {
					System.out.println("패배");
				}else {
					System.out.println("무승부");
				}
			}
				else {
					System.out.println("다시입력하세요.");
				
			}
			
		}
		
	}

}
	
