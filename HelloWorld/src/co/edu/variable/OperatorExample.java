package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		
		int money = 98510;
		int f= 0;
		int m= 0;
		int fc= 0;
		int c=0;
		int b= 0;
		int fb=0;
		int cw=0;
		
		if(money >= 50000) {
			f= money/50000;
			money%=50000;
		}
		if(money>=10000) {
			m=money/10000;
			money%=10000;
		}
		if(money>=5000) {
			fc=money/5000;
			money%=5000;
		}
		if(money>=1000) {
		   c=money/1000;
		   money%=1000;
		}
		if(money >= 500) {
			fb= money/500;
			money%=500;
		}
		if(money>=100) {
			b=money/100;
			money%=100;
		}
		if(money>=10) {
			cw=money/10;
			money%=10;
		}
			
		System.out.printf("오만원은%d 만원은 %d 오천원은%d 천원은%d 오백원은%d 백원은%d 십원은%d",f,m,fc,c,fb,b,cw);
	}

}
