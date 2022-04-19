package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

// 친구목록을 저장하기 위한 app.
// 추가 수정 삭제 조회
// 배열을 활용해서 만들고  두번째는 컬렉션으로 만듬 <- 두개다 인터페이스를 구현.
// 추가 수정 삭제 조회 하도록 컨트롤 역할. FriendService
public class FriendApp {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {
			FriendService service = new FriendServieArray();
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("이름을 입력하시오");
				String name = scn.nextLine();
				System.out.println("연락처를 입력하시오");
				String phone = scn.nextLine();
				Friend fr = new Friend(name,phone);
				service.addFriend(fr);
				
				
			} else if (menu == 2) {
				System.out.println("이름을 입력하시오");
				String mod = scn.nextLine();
				Friend fr = new Friend(mod);
				service.modFriend(fr);

			} else if (menu == 3) {

			} else if (menu == 4) {
				System.out.println("조회하고 싶은 이름을 입력하시오");
				String name = scn.nextLine();
				Friend fre= service.findFriend(name);
				if(fre != null) {
				System.out.println(fre.toString());
				}
			} else if (menu == 5) {
				for(int i = 0; i<10; i++) {
					
					
				}

			}

		}

//		 FriendService service = new FriendServieList(); 

//		service.addFriend(null);
//		service.modFriend(null);
	}

}
