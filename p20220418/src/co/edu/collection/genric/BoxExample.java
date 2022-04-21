package co.edu.collection.genric;

import java.lang.reflect.Array;
import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange{
}

public  class BoxExample {
	public static void main(String[] args) {

		Box<String > box = new Box<String>();
		box.setField("Orange");
		String  result = (String) box.getField(); //string 타입으로 받고 싶으면 object타입이니깐 형변환을 해야한다.
		
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 =  box2.getField();
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길덩");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동","1111111"));
		
//		Orange orange = (Orange) box.getField();
	}

}
