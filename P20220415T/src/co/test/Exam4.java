package co.test;

import java.util.Scanner;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)

 Exam4[] friends = new Exam4[5];
 Scanner scn = new Scanner(System.in);

	private String friendName;
	private String birthday;
	private String phone;

	
	
	
	public Exam4() {
		
	}
	public Exam4(String friendName) {
		this.friendName = friendName;
	}
	
	public Exam4(String friendName, String birthday, String phone) {
		super();
		this.friendName = friendName;
		this.birthday = birthday;
		this.phone = phone;
	}



	public String getFriendName() {
		return friendName;
	}



	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Exam4 [friendName=" + friendName + ", birthday=" + birthday + ", phone=" + phone + "]";
	}

	
	public void addFriend(Exam4 friend) {
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
	public void modify(Exam4 name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getFriendName().equals(name.getFriendName())){
				System.out.println("수정할 연락처>>");
				friends[i].setPhone(scn.nextLine());
				System.out.println("수정할 생일>>");
				friends[i].setBirthday(scn.nextLine());
				break;
			}
		}
		
	}
	public void reFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i].setFriendName(null);
				friends[i].setBirthday(null);
				friends[i].setPhone(null);
				
			}
		}
		
	}
	
	public Exam4 findFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].getFriendName().equals(name)) {
				System.out.println(friends[i].toString());
				return friends[i];
				
			}
		}
		return null;
		
	}
}
	
	