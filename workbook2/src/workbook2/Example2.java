package workbook2;

public class Example2 {

	public static void main(String[] args) {

//		int[][] array = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
//		for(int i=0; i<array.length;i++) {
//			for(int j=0; j<array[i].length; j++) {
//			}
//		}
//		System.out.println(array.length);
//
//		System.out.println(array[2].length);
//	
	
	int[] array1 = { 1 , 5, 3, 8, 2 };
	int max = 0;
	for(int j=0; j<5; j++) {
		if(max < array1[j]) {
			max = array1[j];
		}
	}
	System.out.println(max);
//		int[] intAry = {1, 5, 3, 8, 2};
//		int max = 0;
//		for(int i =0; i<5; i++) {
//		   if( max < intAry[i]) {
//			max = intAry[i];
//		   }
//		}
//		System.out.println(max);
}
}
