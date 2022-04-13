package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println(studentNum + "명이 있습니다");

			} else if (selectNo == 2) {
				if (studentNum == 0) {
					System.out.println("학생수를 입력하시오");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.println("학생[" + i + "]>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) {
				//if문으로 배열 막아버리기.
				if (studentNum == 0) {
					System.out.println("학생수를 입력하시오");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.println("학생[" + i + "]>" + scores[i]);
				}

			} else if (selectNo == 4) {
				if (studentNum == 0) {
					System.out.println("학생수를 입력하시오");
					continue;
				}
				int max, sum, min;
				max = sum = 0;
				min = 10000;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];

					if (scores[i] > max) {
						max = scores[i];
					}
					if (scores[i] < min) {
						min = scores[i];
					}
				}
				System.out.println("최고점수: " + max);
				System.out.println("최저점수: " + min);
				System.out.printf("평균 점수: %2f", (double) sum / scores.length);
				System.out.println();

			}

			else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
