package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

//배열을 활용

public class FriendServieArray implements FriendService {

	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}

		}

	}

	@Override
	public void modFriend(Friend friend) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i]!=null && friends[i].getName().equals(friend.getName())) {
			  System.out.println("연락처를 입력하시오");
			  friends[i].setPhone(scn.nextLine());
			  break;}
		}

	}

	@Override
	public void remFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setName(null) ;
				System.out.println("삭제되었습니다.");
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

}
