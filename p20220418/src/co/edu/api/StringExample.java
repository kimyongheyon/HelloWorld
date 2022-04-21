package co.edu.api;

import java.util.ArrayList;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Scanner scanner = new Scanner(System.in);

		System.out.print("당신의 주민번호를 입력하세요 : ");
		String num = scanner.nextLine(); 

		char gender = num.charAt(7); 
		String gender1; 
		char year = num.charAt(0); 
		String year1;

		if (gender == '1' || gender == '3') {
			gender1 = "남자";
		} else if (gender == '2' || gender == '4') {
			gender1 = "여자";
		} else {
			gender1 = "성별이 없습니다.";
		} 

		if (year >= '2') {
			year1 = "2000년 이전";
		} else {
			year1 = "2000년 이후";
		} 

		System.out.println("당신은 " + year1 + "에 출생한 " + gender1 + "입니다.");



	}

}
