package co.edu.arry;

public class ArrayExample4 {

	public static void main(String[] args) {
		// 1 ~ 30 범위의 임의 값.
		// 23 12 27 22 6
		// 15보다 큰 값만 합계 평균

		int randomVal = (int) (Math.random() * 30 + 1);
		int[] intAry = new int[5];
		int sum = 0;
		double avg = 0.0;
		double cnt = 0.0;

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 30 + 1);
		}
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > 15) {
				cnt++;
				sum += intAry[i];
				avg = sum / cnt;
				System.out.println(intAry[i]);

			}
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
