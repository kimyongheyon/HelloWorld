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
				break;
			}
		}
		
		
	}

	@Override //삭제
	public void remFriend(String name) {
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
				break;
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

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getGender() == (gender)) { //열거형일 때는 == 걸로 비교한다.
				     //열거형타입 클래스타입과 같은 참조타입.
				     //기본타입인 경우는 == 비교연산자.
				    // 열거형도 == 비교연산자로 비교.
				list.add(friends.get(i));
			}
			
		}
		return list;
	}

	
	
	
}
