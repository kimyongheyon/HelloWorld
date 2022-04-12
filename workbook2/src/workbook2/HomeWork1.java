package workbook2;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("오렌지 개수를 적어주세요");
		   int orange= scn.nextInt();
		      int tenbox=0;
		      int fivebox=0;
		      
		      tenbox=orange/10;
		      orange%=10;
		      fivebox=orange/5;
		      orange%=5;
		      if(orange>0) {
		         fivebox+=1;
		      }
		      
		      System.out.printf("10개씩 담는 박스는%d이고 5개씩 담는 박스는%d입니다",tenbox,fivebox);
		      
		   }
	}


