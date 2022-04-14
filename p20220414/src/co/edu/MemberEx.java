package co.edu;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[3];
//값 입력
		for (int i = 0; i < members.length; i++) {

			System.out.println("아이디 이름 연락처 나이 입력.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());

			Member newMember = new Member(id, name, phone, age);

			members[i] = newMember;
		}

		while (true) {
			System.out.println("1.조회 2.변경 3. 조회(나이 큰 회원만 조회) 4. 종료");
			System.out.println("선택>>>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("조회하실 이름을 입력해 주세요");
				String searchName = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMemberName().equals(searchName)) {
						System.out.printf("조회하신 아이디:%s 이름:%s 연락처:%s 나이:%d입니다.", members[i].getMemberId(),
								members[i].getMemberName(), members[i].getMeberPhon(), members[i].getMeberAge());
					}
				}
			} else if (menu == 2) {
				System.out.println("연락처를 변경할 아이디를 입력해주세요");
				String seacrchId = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMemberId().equals(seacrchId)) {
						System.out.println("연락처를 입력해 주세요");
						members[i].setMeberPhon(scn.nextLine());
						break;
					}
				}

			} else if (menu == 3) {
				System.out.println("기준이 될 나이를 입력하세요");
				int searchAge = Integer.parseInt(scn.next());
				System.out.println("기준 나이보다 더 큰 나이를 뽑아왔습니다.");
				for (int i = 0; i < members.length; i++) {
					if (members[i].getMeberAge() > searchAge) {
						System.out.println(members[i].getMeberAge());
					}
				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				for (Member member : members) {
					member.showInfo();

				}

			}

		}
	}
}
