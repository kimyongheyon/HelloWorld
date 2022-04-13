package co.edu;

public class OperatorExample4 {

	public static void main(String[] args) {

		//삼항 연사자.
		
		int num =10;
		String msg = "";
		if(num %2 ==0) {
			msg = "짝수입니다.";
		}else {
			msg = "홀수입니다.";
		}
		
		msg = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		// ? 참일 경우  : 거짓일 경우.
		System.out.println(num +"은 "+msg);
		
	}

}
