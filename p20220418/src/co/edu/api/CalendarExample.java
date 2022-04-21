package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println("년도 입력");
//		int y = scn.nextInt();
//		System.out.println("달 입력");
//		int m = scn.nextInt();
//		
//		today.set(y, m);
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH));
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		System.out.println("년도를 입력");
		int year = scn.nextInt();
		scn.nextLine();
		System.out.println("월을 입력");
		int month = scn.nextInt();
		scn.nextLine();
		System.out.println("일을 입력");
		int day = scn.nextInt();

		Calendar today = Calendar.getInstance();
	today.set(year, month, day);
		System.out.println("년도: " + today.get(Calendar.YEAR));
		System.out.println("월 :" + today.get(Calendar.MONTH));		
		System.out.println("요일 :" + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE));

		///////////////////////////////////////
//
//		Date todate = new Date();
//		todate = new Date("20212/05/05");
//		todate.setYear(2022); // 1900(기준) + 2022 = 3922 
//		System.out.println(todate.toString());
//		
//		LocalDate ldate = LocalDate.of(2022, 10, 11); //날짜
//		System.out.println(ldate.toString());  
//		
//		LocalTime ltime = LocalTime.of(10, 10); //시간
//		System.out.println(ltime.toString());
//		
//		LocalDateTime ldt = LocalDateTime.now();/	ldt = LocalDateTime.of(2022, 10, 5, 10, 20, 30);
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		System.out.println(ldt.format(dtf));
//
//		
		
		
		
		
	}

}
