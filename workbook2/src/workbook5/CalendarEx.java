package workbook5;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("희망 연도와 월을 입력하시오");
		
		System.out.println("연도>>");
		int year = scn.nextInt();
		
		System.out.println("월>>");
		int month = scn.nextInt();
		
		
		System.out.println("\n["+year+"년"+month+"월]");
		System.out.println("   일    월    화    수    목    금    토");
		 
		today.set(year, month-1,1); //월은 0~11을 리턴하기 때문에 1을 빼줘야한다. 그리고 일은 1부터 시작이기때문에 1을 쓴다.
		
		int lastofDate = today.getActualMaximum(Calendar.DATE);
		
		int week = today.get(Calendar.DAY_OF_WEEK);  //요일은 1~7로 숫자로 표현된다.
		
		for(int i=1; i<week; i++) {   //1일의 요일을 측정해서 해당 요일전까지는 공백처리!!
			 
			System.out.print(" ");
			
		}
		
		for(int i=1; i<lastofDate; i++) {
			System.out.print((i<10) ? "  "+i :"  "+i);  //매주 줄바꿈
			 if(week % 7 ==6) {
				 System.out.println();
				 
				 week++;
			 }
			 
			
		}
		System.out.println("\n=====================================");
		
		
	}

}
