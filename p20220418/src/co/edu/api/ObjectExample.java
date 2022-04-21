package co.edu.api;

import java.util.HashSet;

class Member{
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	@Override
	public int hashCode() {
		
//		return super.hashCode();
		return this.age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return this.name.equals(member.name);
		}
		
//		return super.equals(obj);
		return false;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}


public class ObjectExample {

	public static void main(String[] args) {

		//ArrayList : 인덱스 요소를 구분 > 중된 값도 저장가능
		//set (집합) : 요소값으로 구분 > 중복된 값 x
		// hashcode 와 equals를 비교하고 같은 값이지 확인.
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		System.out.println(set.size()); // 중복된 값 제외
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동",22));
		members.add(new Member("홍길동",20));
		
		System.out.println(members.size());
		
		System.out.println(new Member("홍길동",20).toString());
		
	}

}
