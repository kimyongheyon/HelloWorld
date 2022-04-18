package co.edu;

public class InheritExample {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.field1 = ""; // 부모클래스인 parent가 갖고잇는 필드.
		c1.field2 = ""; // 자식클래스인 자기 자신이 갖고있는필드.

		c1.method1();
		c1.method2();

		Child2 c2 = new Child2();
		c2.field1 = ""; // 부모필드
		c2.field3 = ""; // 자식필드

		c2.method1();
		c2.method3();

		// 부모의 참조변수에 자식인스턴스를 할당.
		Parent p1 = new Parent();
		p1 = new Child1(); // 자동 형 변환이 이루어진다.(이런 식으로 되면 부모 필드 메소드만 사용가능하다.)
		p1 = new Child2(); //

		p1.field3 = ""; // 부모가 갖고있는 필드와 메소드만 사용이 가능
		p1.method1(); // 부모가 갖고있는 필드와 메소드만 사용이 가능
		             

		
		
		c2 = (Child2) p1; // 큰 걸 작은 거로 담을 때는 강제 형 변환을 해야한다.
		// (캐스팅)            // 이런 식으로 되면 자식 필드 메소드까지 사용가능하다.
		c2.field1 = "";
		c2.field3 = "";

		c2.method1();
		c2.method3();
	}

}
