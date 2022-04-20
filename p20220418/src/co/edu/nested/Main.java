package co.edu.nested;

import co.edu.nested.Outer.Inner2;

public class Main {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.method1();
		
		// instance 멤버클래스   //instance는 new로 만들고 사용가능
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		//static 멤버클래스 new로 인스턴스를 안 만들고도 생성가능.
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4();  //인스턴스 메소드
		
		inner2.method5();  //정적 메소드
		
		
	}

}
