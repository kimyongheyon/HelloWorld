package workbook4;

import java.util.ArrayList;

public class FriendServiceList implements FriendService {

	
	
	
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	
	@Override //추가
	public void addFriend(Friend friend) {
		
			friends.add(friend);
			
	}

	@Override //수정
	public void modFriend(Friend friend) {
		for(int i =0; i<friends.size(); i++) {
			if(friends.get(i).getName().equals(friend.getName())) {
				friends.set(i, friend);
			}
		}
		
		
	}

	@Override //삭제
	public void remFriend(String name) {
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	@Override //조회
	public Friend findFriend(String name) {
		for(int i=0; i<friends.size(); i++) {
			
			if(friends.get(i).getName().equals(name)) {
				return friends.get(i);
			}
		}
		return null;
	}

	
	
	
}
