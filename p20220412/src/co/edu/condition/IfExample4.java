package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
// 임의의 값을 생성해주는 Math.random();
	int randomVal = (int) (Math.random() * 100) + 1; //반환값이 double타입 0 <= 값 < 1
	System.out.println(randomVal);
	
	
	// 생성된 값이 1 ~ 50까지 .
	// 생성된 값이 51 ~ 60까지.
	// 61 ~ 70, 71 ~ 80, 81 ~ 90, 91 ~ 100 범위.
	
	if(randomVal >=91) {
		System.out.println("91~100입니다.");
	}else if(randomVal >= 81) {
		System.out.println("81~90입니다.");
	}else if(randomVal >= 71) {
		System.out.println("71~80입니다.");
	}else if(randomVal >= 61) {
		System.out.println("61~70입니다.");
	}else if(randomVal >= 51) {
		System.out.println("51~60입니다.");
	}else if(randomVal >= 1) {
		System.out.println("1~50입니다.");
	}else {
		System.out.println("0이거나 숫자를 잘못 입력하셨습니다.");
	}
	
	
	
	
	
	
	
	
	
	
 	}

}
