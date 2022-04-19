package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

// 배열을 사용해서 저장하는 것과 vs 컬렉션을 사용해서 저장하는 법.
// 배열을 활용한 프로그램, 컬렉션을 활용한 프로그램.
// 공통된 규칙을 활용하려면 인터페이스를 선언 > 구현하는 클래스.
public class ArrayExample {

	public static void main(String[] args) {
		
		//배열은 크기가 변경 불가.vs 컬렉션은 크기가 변경 가능, null확인 x
		
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111");
		friendAry[1] = new Friend("김길동", "010-2222");
		friendAry[8] = null;  //범위를 벗어나면 에러 발생
		for(int i =0; i<friendAry.length; i++) {
			if(friendAry[i] != null) {
			System.out.println(friendAry[i].toString());
		}
		}	
		
		
		//컬렉션을 활용. 인터페이스 => Lits : 컬렉션 => ArrayList
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("박길동","010-3333"));
		friendList.add(new Friend("최길동","010-4444")); //추가
		friendList.remove(0); //삭제
		
		for(int i=0; i<friendList.size(); i++) {
			
			System.out.println(friendList.get(i));
		}
		Friend f2 = (Friend) friendList.get(0); // 값을 가지고 오려면 저렇게 해야한다.
		                                        // objact라서 형변환을 해줘야한다.
		
//		friendList.isEmpty();               //안에 값이 있는지 없는지 확인하는 메소드.
	}
	
	
	
	
	
}
