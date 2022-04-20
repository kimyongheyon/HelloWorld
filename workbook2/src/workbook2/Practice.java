package workbook2;

public class Practice {

	public static void main(String[] args) {
		
		// (&&) and연산자에 정의 : 둘다 참이여야지 결과 값이 나온다. 

		if(true && true) {  // 조건 판단 결과 : 참
			System.out.println(1); 
		}
		
		if(true && false) { // 조건 판단 결과 : 거짓
			System.out.println(2);
		}
		if(false && false) {
			System.out.println(3);
		}
		
		// or연산자 || 하나만 참이라도 전체 값이 참으로 출력

		if(true || false) {
			System.out.println(1);
		}
		if(true || true) {
			System.out.println(2);
		}
		if(false || true) {
			System.out.println(3);
		}
		
		// not 연산자 !는 참이면 거짓으로 거짓이면 참으로 역전시키는 기능
		if(!true) {
			System.out.println(3);
		}
		if(!false) {
			System.out.println(4);
		}
	// 대부분의 연산자는 왼쪽에서 오른쪽으로 가지만 (대입, 단항 부호 연산자는 오른쪽부터 시작한다)
	}      // 대입 : (= += -=) 등 , 단항 : (++ -- ~ !), 부호 ( + - )

}
