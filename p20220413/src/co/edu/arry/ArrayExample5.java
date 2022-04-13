package co.edu.arry;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {

		//학생5명의 점수를 담을 수 있는 배열
		// 학생중 최고점 최저점 
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("학생점수를 입력>>>>");
			scores[i] = scn.nextInt();
		}
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		double cnt = 0.0;
		int min = scores[0];
		for(int i=0; i<scores.length; i++) {
			cnt++;
			sum+=scores[i];
			avg= sum/cnt;
			if(max<scores[i]) {
				max = scores[i];
				}
			if(min>scores[i]) {
				min=scores[i];
			}
		}
		System.out.println("최고점은"+max+"최저점은"+min+"합은 "+sum+"평균 "+avg);
		
		
		//학생이름 점수. 학생이름 배열. 점수배열
		
		
		
		
		
		
	}


}
