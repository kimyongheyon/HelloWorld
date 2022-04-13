package co.edu.arry;

public class ArrayExample {

	public static void main(String[] args) {
		
		//학생의 점수 30명.
		int score1 = 80;
		
        //여러개의 같은 유형의 값을 저장.
		int[] intAry = new int[30];//참조타입은 new를 사용 담을 공간의 수를 적는다
		                             //정수 int 30개 공간을 생성함.
		
		
		intAry[0]=30;//0부터 시작하므로 0이 첫번째이다.
		intAry[4]=40;
		intAry[29]=55;
		
		System.out.println(intAry[0]); 
		System.out.println(intAry[1]);//정수의 초기값은 0
		
		String[] strAry = new String[5];//참조변수의 초기값은 null
		System.out.println(strAry[0]);
		
		int[] otherAry = {10, 20, 30, 40};//초기값을 지정.
		int[] theotherAry = {10, 20, 30, 40};
		System.out.println(otherAry[0]);
		
		if(otherAry[0] == theotherAry[0]) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
		
		
		
		
		
		
		double[] dblAry = new double[10];//double형태의 저장공간 10개를 선언.
		
		
		
		
		
		
		
		
	}

}
