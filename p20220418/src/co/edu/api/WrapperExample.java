package co.edu.api;

public class WrapperExample {

	public static void main(String[] args) {

		//랩퍼클래스.
		//기본데이터 -> 참조데이터 
		//int,long,byte,float(기본데이터) -> Integer, Long, Byte,Float로 바꿈
		int n1 = 100;
		Integer n2 =  200;// 200; 박싱.
		n1 = n2; //n1은 기본타입 n2는 클래스타입이지만 언박싱을 하기때문에 저런 식으로 대입이 가능
		byte b1 = n2.byteValue();
		System.out.println(b1);
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
		
	}

}
