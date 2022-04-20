package co.test;

import java.util.Arrays;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장. 10개를 다 더한 값에 
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {

		int[] val = new int[10];
		int[] val2 = new int[10];
		int sum = 0;

		for (int i = 0; i < val.length; i++) {
			
			val[i] = (int) (Math.random() * 10) + 1;
			sum += val[i];

		}
		double avg = (double) sum / val.length;

			for (int j = 0; j < val2.length; j++) {
				
				int random = (int) (Math.random()*avg)+(int)(avg);
					val2[j] = random;
			}
			System.out.println("합: " + sum + "평균: " + avg);
			System.out.println(Arrays.toString(val2));
		}


}
