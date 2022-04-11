package workbook;

import java.util.Scanner;

public class HoweWork2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("갖고있는 돈을 적으시오");
		int mymoney = scn.nextInt();
		
		System.out.println("물건 가격을 적으시오");
		int price = scn.nextInt();
		int tax = price * 5/100;
		
		System.out.printf("현금: "+mymoney+"금액: "+price+"잔돈은: "+(mymoney-price)+"부가세는: "+tax);
		

		
	}

}
