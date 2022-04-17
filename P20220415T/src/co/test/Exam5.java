package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
// 수정은 이름을 받아와서 연락처를 바꾸는 것
// 삭제는 null이 들어가면  이름으로 조회해서 다 삭제.
// 조회는 이름으로 확인
public class Exam5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Exam4 f = new Exam4();
		f.

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회(이름) 5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>>>>>");
			int menu = -1;
			menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) {
				System.out.println("친구 이름을 입력");
				String fn = scn.nextLine();
				System.out.println("친구 생일을 입력");
				String bd = scn.nextLine();
				System.out.println("친구 휴대폰번호 입력");
				String ph = scn.nextLine();
				Exam4 newExam = new Exam4(fn, bd, ph);
				
				
			}
			
			else if(menu == 2){
				
			}
			else if(menu == 3) {
				
			}
			else if(menu ==4) {
				
			}
			else if(menu == 5) {
				System.out.println("종료합니다");
				break;
			}
	
			
		}
	}
//		System.out.println("end of prog.");
}
