package workbook2;

public class Practice6 {

	public static void main(String[] args) {

		
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {   // 조건식을 거르고 조건식에 걸리지 않는 값을 산출할 때 쓰면 좋을듯
				continue;
			}
			System.out.println(i);
		}
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x)+(5*y) == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
		
		
		
	}

}
