package co.edu.inherit;

public class Taxi extends Car {
	
	// 필드.
	String type; // 개인택시인지, 회사택시인지 구분하기 위해서 type생성
	
	//생성자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
		
	}
	//메소드

	public void metering() {
		System.out.println("요금 계기판");
	}
	
	@Override  //문법 체크하는 것 부모타입에 리턴 값 타입 등 똑같이 하겠다가는 뜻
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
		
	
		
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
