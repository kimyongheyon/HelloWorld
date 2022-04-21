package co.edu.except;

import java.util.Scanner;

public class MismatchEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>");
			int menu = 0;
			
			try {  //Exception
				Class.forName("java.lang.String");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				menu = Integer.parseInt(scn.next());         //scn.nextInt(); //RuntimeException 
			} catch (java.util.InputMismatchException  | NumberFormatException e2) {
				System.out.println("숫자를 선택하세요");
				scn.nextLine();
			}catch(Exception e3) {    //젤 상위에 있는 클래스임.
				System.out.println("알 수 없는 예외 발생");
			} finally {
				System.out.println("예외처리에서 반드시 한번은 실행."); // 이코드는 반드시 실행!!

			}
			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog");
	}
}
