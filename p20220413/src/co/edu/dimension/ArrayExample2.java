package co.edu.dimension;

public class ArrayExample2 {

	public static void main(String[] args) {
      //학급 1 ~ 3
		// 1-3, 2-4, 3-2.
		
		int[][] scores = { {59, 63, 72},{56, 77, 33, 24},{55,76}  };
		
		double avg =0.0;
		
		for(int i=0; i<scores.length;i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length;j++) {
				sum += scores[i][j];
				
			}
			
			avg = sum/scores[i].length;
			System.out.println(sum+" "+avg);
		}
	
	}

}
