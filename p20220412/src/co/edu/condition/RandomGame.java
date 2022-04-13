package co.edu.condition;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		//주사위 게임
		int randomVal = (int)(Math.random() * 6 )+1;
		System.out.println(randomVal);
		
		//가위바위보
		int randomVal2 = (int)(Math.random() * 3)+1;
		
		switch(randomVal2) {
		case 1 : System.out.println("가위");break;
		
		case 2 : System.out.println("바위");break;
		
		case 3 : System.out.println("보");break;
		}
		
		
	
				
		
	
	}
}
