package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + 3;
			// i = 1, sum =3;
			// i = 2, sum =6;
			// i = 3, sum =9;
			// i = 4, sum =12;
			// i = 5, sum =15;

		}
		System.out.println(sum);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

		int sum1 = 0;
		for (int i = 1; i <= 10; i ++) {
			if(i % 2 == 0) {
				sum1 += i;
				System.out.println(sum1);

		}

	}
	}
}
