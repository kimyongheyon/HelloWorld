package workbook2;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("낼 돈을 입력하시오");
		int myMoney = scn.nextInt();
		
		System.out.println("물건의 가격을 입력하시오");
		int price = scn.nextInt();
		
		int tax = price * 5/100;
		int change = myMoney - price;
		
		System.out.printf("물건의 가격은%d이고 내신 금액은%d이고 이 물건에 세금은 %d이고 잔돈은%d입니다.",price,myMoney,tax,change);
		

		
	}

}
