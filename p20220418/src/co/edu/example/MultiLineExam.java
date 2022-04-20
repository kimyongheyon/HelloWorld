package co.edu.example;

import java.util.Scanner;
//무한 글쓰기!!
public class MultiLineExam {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = "";
		
		while(true) {
			String temp = scn.nextLine();
			if(temp.trim().equals("")) {
				System.out.println("종료");
				break;
			}
			str += temp + "\n";
		}
	}

}
