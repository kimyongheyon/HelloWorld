package co.edu.variable;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("화씨를 입력하시오");
		double fahrenheit = scn.nextDouble();
		
		double celsius = 5.0/9*(fahrenheit-32);
		System.out.printf("지금 화씨온도는%.1f 섭씨온도는 %.1f",fahrenheit,celsius);
		
		System.out.println();
		
		System.out.println("섭씨를 입력하시오");
		double c = scn.nextDouble();
		
		double f = 5.0/9*(c+32);
		System.out.printf("지금 화씨는 %.1f", f);
	}

}
