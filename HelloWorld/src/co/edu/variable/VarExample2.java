package co.edu.variable;

public class VarExample2 {

	public static void main(String[] args) {
	
		// 국어  80 영어 70 수학 69
		// 평균 변수 선언.
		
		int KoreanScore = 85;
		int engScore = 72;
		int mathScore = 63;
		
		int result = (KoreanScore + engScore + mathScore) /3;
		double avg = (85 + 75 + 60) / 3.0;
		System.out.println(avg);
		System.out.println("국어:"+KoreanScore+" 영어:"+engScore+" 수학:"+mathScore+" 평균:"+result+"입니다." );
		

	}

}
