package co.edu.arry;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String[] names = new String[3]; // 학생이름
		int[] scores = new int[3]; // 학생점수

		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력>>>>");
			names[i] = scn.nextLine();

			System.out.println("점수를 입력>>>>");
			scores[i] = scn.nextInt();
			 scn.nextLine();
		}

		System.out.println("조회할 학생의 이름을 입력>>>>>");
		String searchName = scn.nextLine();
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println(searchName+" "+scores[i]);
			}
			
		}
		System.out.println("end of prog");
	}

}
