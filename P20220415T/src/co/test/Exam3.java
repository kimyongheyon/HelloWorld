package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장. 10개를 다 더한 값에 
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		
		
		int[] arry ={10,20,40,20,20,70,20,30,40,50};
		int sum =0;
		double avg=0.0;
		for(int i=0; i<arry.length; i++) {
			sum+=arry[i];
			}
		
		avg =sum/10;
		
		
		
		for(int j =0; j < arry.length; j++) {
			if(avg < arry[j]) {
				System.out.println(arry[j]);
			
				
		      
		
					}
				}
				System.out.println(sum +" "+avg);
		}
		
	}

