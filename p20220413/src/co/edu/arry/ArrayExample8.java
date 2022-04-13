package co.edu.arry;

public class ArrayExample8 {

	public static void main(String[] args) {
//주사위 게임 2개를 던짐
		//2개의 숫자의 합이 6이 되는 경우
		//1,5 2,4 3,3 4,2,5,1
		System.out.println("주사위 두 수의 합이 6이 되는 것");
		for(int i=1; i<=6; i++ ) {
			for(int j=1; j<=6; j++) {
				if(i+j ==6) {
					System.out.println("("+i+","+j+")");
				}
			}
			
		}
		
	}

}
