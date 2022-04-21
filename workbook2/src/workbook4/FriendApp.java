package workbook4;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		FriendService service = new FriendServiceArray();

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자 7.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == FriendService.ADD) {
				System.out.println("이름을 입력하시오");
				String name = scn.nextLine();
				System.out.println("연락처를 입력하시오");
				String phone = scn.nextLine();
				System.out.println("성별을 입력하시오 ex) 남자 / 여자");
				String gender = scn.nextLine();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남") || gender.startsWith("M")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여") || gender.startsWith("W")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend);

			} else if (menu == FriendService.MOD) {
				System.out.println("수정할 이름을 입력하시오");
				String name = scn.nextLine();
				Friend friend = new Friend(name);
				service.modFriend(friend);

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 이름을 입력하시오");
				String name = scn.nextLine();

				service.remFriend(name);

			}

			else if (menu == FriendService.SEARCH) {
				System.out.println("조회할 이름을 입력하시오");
				String name = scn.nextLine();
				service.findFriend(name);
			}
			else if(menu == FriendService.MENSEARCH) {
				
			}
			
			else if(menu == FriendService.WOMENSEARCH) {
				
			}
			else if (menu == FriendService.END) {
				System.out.println("시스템을 종료합니다.");
				break;

			}

		}

	}

}
