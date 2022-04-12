package co.edu.condition;

public class CondExample {

	public static void main(String[] args) {
//51 ~ 100 값으로 100~ 90 a, ~ 80 b ~70, c ~60 d, f
		
		int randomVal =(int) (Math.random()*50)+51;
		System.out.println(randomVal);
		
		switch(randomVal/10){
		
		case 10:
		
		case 9: System.out.println("A");break;
		
		case 8: System.out.println("B");break;
		
		case 7: System.out.println("C");break;
		
		case 6: System.out.println("D");break;
		
		default:
			 System.out.println("F");
		}
		//case에 덩어리로 나눠 놓고  랜덤을 10으로 나누면서 십에 자리를 보고 자리를 찾아가는 방식으로 만들었다.
		
		// 잔돈 2500원 임의의 값 범위 (1~ 6 :주사위의 면의 개수)
		//주사위 맞추기 게임.
		//임의의 값 범위(1:가위, 2:바위, 3:보)
		//사용자 입력값 :(1:가위, 2:바위, 3:보)
		
		//이기는 경우 : 1= 2, 2=3, 3=1의 경우 이외의 경우는 지는 경우.
		
		
		
		
		
		
		
		
	}

}
