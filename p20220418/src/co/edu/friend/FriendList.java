package co.edu.friend;

import java.util.Scanner;

public class FriendList {

	public static void main(String[] args) {
		
		final String val = "Hong"; //변수에 붙으면 변경불가
		// 클래스에 붙으면 상속불가 /메소드에 붙으면 오버로딩불가.

		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동","010-7777-8888","대구대학교","컴퓨터정보");
//		friends[1] = new ComFriend("김길동","010-5555-5555","네이버","백엔드");
//		friends[2] = new Friend("박길동","010-5551-4444");
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {

				Friend friend = null;
				
				System.out.println("1.기존친구, 2.학교친구, 3.회사친구 ");

				menu=scn.nextInt();
				scn.nextLine();
				System.out.println("등록할 친구이름을 적으시오");
				String name = scn.nextLine();
				System.out.println("친구의 연락처를 입력하시오");
				String phone = scn.nextLine();

				if (menu == 1) {
					friend = new Friend(name, phone);
				}

				if (menu == 2) {
					System.out.println("학교를 입력하시오");
					String school = scn.nextLine();
					System.out.println("학과를 입력하시오");
					String major = scn.nextLine();
					friend = new UnivFriend(name, phone, school, major);
				}

				if (menu == 3) {
					System.out.println("회사를 입력하시오");
					String companyName = scn.nextLine();
					System.out.println("부서를 입력하시오");
					String section = scn.nextLine();
					friend = new ComFriend(name, phone, companyName, section);
				}
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}

				}
			} else if (menu == 2) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("친구정보: " + friend.toString());
					}

				}
			} else if (menu == 3) {
				System.out.println("조회하고싶은 사람의 이름을 입력하시오");
			    String searchName = scn.nextLine();
				for(int i =0; i<friends.length; i++) {
					if(friends[i].getName().equals(searchName)) {
						System.out.println("친구정보: "+friends[i].toString());
					}
				}

			} else if (menu == 4) {
				break;
			}
		}

	}

}
