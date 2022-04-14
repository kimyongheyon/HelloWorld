package workbook2;

public class Example {

	public static void main(String[] args) {

		int[][] intAry = { {95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
		double avg = 0.0;
		double cnt = 0.0;
		int sum = 0;
		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {
				cnt++;
				sum+=intAry[i][j];
				avg = sum/cnt;
			}
		}
		System.out.println("합은:"+sum+" 평균은:"+avg);
				
	

}
}