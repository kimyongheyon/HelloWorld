package workbook4;

import java.util.Scanner;


public class FriendApp {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		FriendService service = new FriendServiceArray();

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("이름을 입력하시오");
				String name = scn.nextLine();
				System.out.println("연락처를 입력하시오");
				String phone = scn.nextLine();
				Friend friend = new Friend(name, phone);
				service.addFriend(friend);

			} 
			else if (menu == 2) {
				System.out.println("수정할 이름을 입력하시오");
				String name = scn.nextLine();
				Friend friend = new Friend(name);
				service.modFriend(friend);

			}
			else if (menu == 3) {
				System.out.println("삭제할 이름을 입력하시오");
				String name = scn.nextLine();
				
				service.remFriend(name);

			}

			else if (menu == 4) {
				System.out.println("조회할 이름을 입력하시오");
				String name = scn.nextLine();
				service.findFriend(name);
			}
			else if (menu == 5) {
				System.out.println("시스템을 종료합니다.");
				break;

			}

		}

	}

}
