package co.edu;

import java.util.Scanner;

public class CalTimeEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("초를 입력하세요");
		int time= scn.nextInt();
		
		int hours,minutes,secs;
		
		hours = time/(60*60);
		time%=(60*60);
		minutes=time/60;
		time%=60;
		secs = time;
	System.out.printf("시:%d 분:%d 초:%d",hours,minutes,secs );	
	}

}
