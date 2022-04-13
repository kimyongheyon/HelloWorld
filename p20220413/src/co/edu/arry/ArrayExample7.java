package co.edu.arry;

public class ArrayExample7 {

	public static void main(String[] args) {

		String[] days = { "Sun", "Mon", "Tue", "wed", "thr", "fri", "sat" };
		
		int month = 4;
		int lnth = getLastDay(4);

		int[] intAry = new int[lnth];

		// 배열 값을 지정.
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i +1;

		}
		// 요일부분 출력.
		for (int i = 0; i < days.length; i++) {
			
			System.out.printf("%4s", days[i]);// %4s 가 4개의 공백을 갖겠다
			
		}
		System.out.println(); // 줄바꿈
		System.out.println("____________________________");
		int spc = getDayInfo(month); // 임의의 빈공간을 만들기 위해서 만들었다.
		for (int i = 0; i < spc; i++) {
			System.out.printf("%4s", " ");
		}

		// 날짜를 출력.
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i+spc) % 7 == 6) { // spc공간 만큼 i이랑 더해서 줄바꿈하겠다는 의미 아니면 숫자가 뒤로 다 밀려나기 때믄에
				System.out.println();
			}
		}
	}// end of main();

	public static int getLastDay(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30; // 마지막날
		case 5:
			return 31;
		case 6:
			return 30;
		default:
			return 0;
		}
	}

	public static int getDayInfo(int month) {
		switch (month) {
		case 1:
			return 6;
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5; // 요일정보
		case 5:
			return 0;
		case 6:
			return 3;
		default: // 디폴트가 없으면 오류남 if문에 else같은 느낌
			return 0;

		}
	}

}
