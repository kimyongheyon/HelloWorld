package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장. 10개를 다 더한 값에 
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {

		
	     int[] array1 = new int[10];
	     int[] array2 = new int[10];
	     int sum =0;
	     for(int i=0; i<array1.length; i++) {
	    	 array1[i] = (int)(Math.random()*10)+1;
	    	   sum += array1[i] ;
	    	   
	    	  
	     }
	     double avg = sum/array1.length;
	     
		for(int j=0; j<array2.length; j++) {
			array2[j] = array1[j];
			if(avg < array2[j]) {
				System.out.println(array2[j]);
			}
		}
		System.out.println("총합: "+sum+" 평균: "+avg);
		
		
		
		
		
		

	}
}
