package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장. 10개를 다 더한 값에 
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {

		int[] array = { 10, 20, 40, 20, 20, 70, 20, 30, 40, 50 };
		int sum = 0;
		double avg = 0.0;
		int result =0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		int[] array2 = new int[10];
		for (int j = 0; j < array2.length; j++) {
			avg = sum / 10;
			
			if (array2[j] > avg) {
				System.out.println("합: " + sum + "평균: " + avg + "큰 수: " + array2[j]);

			}
		}
	}

}
