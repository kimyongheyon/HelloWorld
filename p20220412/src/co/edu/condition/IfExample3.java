package co.edu.condition;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
		
		// 중첩 구문.
		// 90점 이상 a  80 b, 70 c, 나머지 f
		// 90점 이상 95 = A+ 
       System.out.println("자신의 학점을 입력하시오");
		int score = scn.nextInt();
		
		if(score >= 90) {
			if(score >=95) {
				System.out.println("A+");
			}else {
			   System.out.println("A");
			}
		}else if(score>=80) {
			if(score >=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else if(score>=70) {
			if(score>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
		}else {
			System.out.println("F");
		}
		
		
		
		
	}

}
