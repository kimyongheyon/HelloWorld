package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {

		int val = 10; //4 * 1byte => 1byte = 8bit 	
		

		long val2 = 2147483648L;
		long val3 = 10; //10 -> long형으로 자동으로 변환
		
		int val4 = (int) 2147483648L;// long -> int 타입으로 강제형 변환.
		
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		char charLit = 97;// 0~65535까지의 정수값에 
		System.out.println(charLit);
		charLit = 44032;
		System.out.println(charLit);
	}

}
