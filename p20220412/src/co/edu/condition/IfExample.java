package co.edu.condition;

public class IfExample {

	public static void main(String[] args) {
//점수가 90위면 a, 80 b, 70 c, 나머지 f
		int score = 85;
		
		if(score >=90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		}
		  else if(score >=70){
				System.out.println("C학점");
		}
		  else {
				
			System.out.println("F학점");
			}
		
		//////////////////////////////////////
		if(score >=90) {
			System.out.println("A학점");
		}
		if(score >=80) {
			System.out.println("B학점");
		}
		if(score >=70) {
			System.out.println("C학점");
		}
		if(score <70) {
			System.out.println("F학점");
		}
		
		
		}
		
		
		
	}


