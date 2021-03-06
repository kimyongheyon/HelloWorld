package workbook4;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		FriendService service = new FriendServiceList();

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
				System.out.println("성별을 입력하시오 ex) 남/여");
				String gender = scn.nextLine();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone,gen);
				service.addFriend(friend);
				System.out.println("추가되었습니다.");
				
				
			} else if (menu == FriendService.MOD) {
				System.out.println("수정하실 이름을 입력하시오");
				String name = scn.nextLine();
				System.out.println("수정하실 연락처를 입력하시오");
				String phone = scn.nextLine();
				Friend mod = new Friend(name, phone);
				service.modFriend(mod);
				System.out.println("수정이 완료 되었습니다.");

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 이름을 입력하시오");
				String name = scn.nextLine();
				service.remFriend(name);
				System.out.println("삭제되었습니다.");
			} else if (menu == FriendService.SEARCH) {

				System.out.println("조회하실 이름을 입력하시오");
				String name = scn.nextLine();
				Friend find = service.findFriend(name);
				if (find != null) {
					System.out.println(find.toString());
				} else {
					System.out.println("없는 이름입니다.");
				}

			}

			else if (menu == FriendService.MENSEARCH) {
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}

			}

			else if (menu == FriendService.WOMENSEARCH) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}

			} else if (menu == FriendService.END) {
				System.out.println("시스템을 종료합니다.");
				break;

			}

		}

	}

}
