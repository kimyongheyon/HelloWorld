package co.edu;

public class Calculator {

	private double pi = 3.14;
	
	
	//리턴타입 없는 것. 
	void printPi() {
		System.out.println("원주율은 "+pi+"입니다.");
	}
	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 "+ radius+"의 넓이는"+area);
	}
	//리턴타입 있는 것.
	
	//메소드의 오버로딩 = 동일한 이름의 메소드를 사용은 가능하나 매개변수의 타입이나 개수가 달라야지 사용 가능하다.
	int sum(int num1, int num2 ){
	return num1 + num2;
	
	}
	double sum(double n1, double n2) {
		return n1 + n2;
	}
	
	// 밑변과 높이를 입력 >>> 삼각형의 넓이를 계산 메소드. getTriangleArea 
	
   double getTriangleArea(double l1, double l2) {
	   return l1 * l2 /2;
   }
	
   
   // 매개변수 클래스 배열 다 올 수 있다.
   int sum(int[]ary) {
	   int sum =0;
	   for(int i=0; i<ary.length; i++) {
		   sum += ary[i];
	   }
	   return sum;
   }
   
   //평균 계산

   double average(int n1, int n2, int n3 ) {
	   
	   return (n1 + n2 + n3) /3.0;
	   
   }
   double average(int ...args) {
	   int sum = 0;
	   for(int i=0; i<args.length; i++) {
		   sum += args[i];
	   }
	   return (double)sum / args.length;
   }
	
	
	
	
	
	
	
}
