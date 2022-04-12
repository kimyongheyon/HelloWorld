package co.edu;

public class OperatorExample3 {

	public static void main(String[] args) {

		// 비교연산, 논리연산
		int num1 = 10;
		int num2 = 20;
		
		
		if(num1 == num2) {
			System.out.println("두수는 같습니다.");
		}
		
		if(num1 != num2) {
			System.out.println("두수는 같지 않습니다.");
		}
		if(num1 >= num2) {
			System.out.println(num1 + "이 "+ num2 + "보다 큽니다.");
		}
		if((++num1 % 2 == 0) && (num2++ % 2 == 0)) { //(그리고) 두개 다 참일 경우 참으로 나온다
			System.out.println("두수는 짝수 입니다.");    // &를 하나만 쓰면 앞이 거짓이라도 뒤에까지 계산을 한다.
		}else {
			System.out.println("두수가 짝수는 아닙니다.");
		}
		
		System.out.println(num1 +" "+ num2);
		
		if((num1 % 2 == 0) || (num2 % 2 == 0)) { // (또는) 두개중 하나만 참이여도 참으로 나온 
			System.out.println("두수중에 하나는 짝수 입니다.");
		}else {
			System.out.println("두수가 다 홀수입니다.");
		}
		
		System.out.println("end of prog");
				
		
	}

}
