package co.edu.loop;

public class ForExample3 {

	public static void main(String[] args) {

		// 1~100 반복. 1000보다 큰 값 중 최소값을 구하는 것
		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (sum >= 1000) {
				break;
			}
			sum += i;

			System.out.println("1000보다 큰 최소 값:" + sum + " 순번: " + i);
		}
		// 1 ~ 10 반복
		// sum=sum *1;
		int sum1 = 1;
		for (int i = 1; i <= 10; i++) {

			sum1 *= i;
		}
		System.out.println("1~10까지 곱한 결과: " + sum1);
		
		//100약수를 출력

		for(int i=1; i<=100; i++) {
			if(100%i == 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
