package co.edu.arry;

public class ArrayExample3 {

	public static void main(String[] args) {

		int[] intAry = { 78, 83, 88, 92, 63 };

		// 합을 구하는 코드. sum선언
		double cnt = 0.0;
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				cnt++;
				sum += intAry[i];
				avg = sum / cnt;
			}
		}
		System.out.println(sum);
		System.out.println(avg);

	}
}