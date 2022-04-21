package co.edu.nested;

import java.util.Scanner;

class Friend { // 이건 그냥 따로 선언한 것 중첩 클래스 x

	String name;
	String phone;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	// ----------------------------------------------------------------//

}

//중첩클래스 만들고, 중첩 인터페이스 만들기.
public class NestedAPP {

	// 필드
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	// 중첩인터페이스.
	interface FriendService {
		int ADD = 1;
		int MOD = 2; // 함수
		int LIST = 3;

		void add();

		void modify();

		void list();

	}

	// 중첩 클래스.
	static class FriendApp implements FriendService {

		@Override
		public void add() {
			System.out.println("이름>>");
			String name = scn.next();
			System.out.println("연락처>>");
			String phone = scn.next();
			System.out.println("나이>>");
			int age = scn.nextInt();
			scn.nextLine();
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			for(int i=0; i<friends.length; i++) {
				if(friends[i] == null ){
					friends[i] = friend;
					break;
				}
			}
			System.out.println("추가되었습니다.");


		}

		@Override
		public void modify() {
			System.out.println("수정할 이름>>");
			String name = scn.nextLine();
			System.out.println("수정할 연락처>>");
			String phone = scn.nextLine();
			System.out.println("수정할 나이");
			int age = Integer.parseInt(scn.nextLine());
			for(int i=0; i<friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					friends[i].setPhone(phone) ;
					friends[i].setAge(age);
					System.out.println("수정완료");
					break;
				}
			}

		}

		@Override
		public void list() {
			System.out.println("찾을 이름>>");
			String name = scn.nextLine();
			for(int i=0; i<friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println(friends[i].toString());
				break;
				}
			}
			
		}

	}

	public static void main(String[] args) {
		FriendApp app = new FriendApp();

		while (true) {
			System.out.println("1.추가 2.수정 3.조회");
			System.out.println("---------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == FriendService.ADD) {
				app.add();
			}
			else if(menu ==FriendService.MOD ) {
			    app.modify();
				
			}
			else if(menu == FriendService.LIST) {
				app.list();
			}
			else {
				break;
			}

		}
//		app.add();
//		app.add();
//		app.modify();
//		app.list();

	}

}
