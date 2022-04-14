package co.edu;

public class Televisiom {
	//객체 -> 도면 -> 텔레비전(삼성, 엘지)
	//object -> class -> instance.
	// 추상화 (텔레비전의 필요한 부분만 정리)
	//  ( 속성 )  ( 기능 )을 나누어 정리.
	
	//속성 = 필드 
	String company;
	String model;
	int price;
	String color;
	
	
	//기능 = 메소드(반환유형, 메소드명, 매개변수) 
	void turnOn(){
		System.out.println("텔레비전을 킵니다.");
	}
	
	void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}
	
	void changeChanel(int chanel){
	}

}
