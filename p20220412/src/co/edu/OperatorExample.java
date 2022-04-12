package co.edu;

public class OperatorExample {

	public static void main(String[] args) {
		//증감 연산자.
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + 2;//오른쪽 num1의 값을 읽고 결과값을 대입.
		num1 = num1 + 2;
		System.out.println(num1);

		num1 = num1 +1;
		num1 += 1; // 원래 자기 값을 1을 더하고 넘긴다
		num1++; // 1 누적연산.
		System.out.println(num1);
		System.out.println(num1++); // 연산처리후 1이 증가한다.
		System.out.println(num1);//다시 출력처리를 하면 뒤에 한 증감식이 나온다.
		
		System.out.println(++num1);//이건 증가를 먼저 하고 출력이 돼서 +1이 되어서 나온다,.
		
		int result = num1++ + ++num2; // 19+21
		System.out.println(result);
		
		
		byte num3 = 10; //byte < short < int < long
		num3 = (byte) (num3 + 1);//정수연산에서 int타입으로 처리
		
		num3 += 1;
		num3++;
		
		num3 = 125;
		num3++; //126
		num3++; //127
		num3++; //?? 제일 큰 값으로 가면 제일 작은 값으로 돌아간다. ) -128로 시작
		num3++; //?? -127
		num3++; //?? -126
		System.out.println(num3);
		
		
		
		
		
		
		
	}

}
