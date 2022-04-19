package workbook4;

import java.util.Scanner;

public class FriendServiceArray implements FriendService {
	
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	
	

	@Override   // 추가
	public void addFriend(Friend friend) {
		for(int i =0; i<friends.length; i++) {
			if(friends[i]==null) {
				friends[i] = friend;
				System.out.println("추가되었습니다.");
				break;
			}
		}
	
		
		
		
	}

	@Override //수정
	public void modFriend(Friend friend) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(friend.getName())) {
				System.out.println("연락처를 입력하시오");
				friends[i].setPhone(scn.nextLine());;
				System.out.println("수정이 완료되었습니다.");
				break;
			}
		}
	}

	@Override //삭제
	public void remFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i]!=null && friends[i].getName().equals(name)) {
				friends[i].setName(null);
				friends[i].setPhone(null);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
	}

	@Override //조회
	public Friend findFriend(String name) {
		try {
			for(int i=0; i<friends.length; i++) {
				if(friends[i] != null && friends[i].getName().equals(name)) {
					System.out.println(friends[i].toString());
					return friends[i];
				}
			}
			
		} catch (java.lang.NullPointerException e) {
			System.out.println("존재하지 않습니다.");
			
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
