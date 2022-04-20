package workbook2;

public class Practice8 {

	public static void main(String[] args) {


//		
//		String name1 ="신영권";
//		String name2 ="신영권";
//		
//		if(name1 == name2) {
//			System.out.println("참");
//			
//		}else {
//			System.out.println("거짓");
//		}
//		
//		String name3 = new String("신영권");
//		String name4 = new String("신영권");
//		if(name3 == name4) {
//			System.out.println("참");
//			
//		}else {
//			System.out.println("거짓");
//		}
		
		int sum2 = add(new int[] {83, 90, 60});
		System.out.println("총합: "+sum2);
		
	}
		
		public static int add( int[] scores ){
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				
				sum += scores[i];
			}
			return sum;
		}
		
		
		
}