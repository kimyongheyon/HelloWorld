package co.edu.game;

import java.util.Arrays;
import java.util.Scanner;

/////집에서 해보기
public class Game {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] program = new int[5];

		for (int i = 0; i < program.length; i++) {

			program[i] = (int) (Math.random() * 5) + 1;

			for (int j = 0; j < i; j++) {
				if (program[i] == program[j]) {
					i--;
					break;
				}
			}

		}
		while (true) {
			System.out.println("=======================");
			System.out.println("1~5중에 5라는 숫자 맞추기 게임");
			System.out.println("[1] [2] [3] [4] [5] 중 하나를 선택하세요");

			int search;
			for(int y= 0; y<program.length; y++) {
				if(program[y]==5) {
					
				}
			}
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				for (int i = 0; i < 5; i++) {
					program[i] = i + 1;
				}
				for (int i = 0; i < 5; i++) {
					if (i == 1) {
						System.out.println("[" + program[i] + "]");
					} else {
						System.out.println("[*]");
					}
				}

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}

			
				}
			
		

	}

}
