package co.edu;

public class ReferenceExam {

	public static void main(String[] args) {
		//기본타입.
		int num1 =100;
		
		int num2 =100;
		
		if(num1 == num2) {
			
			System.out.println("같은 값.");
		}
		else {
			System.out.println("다른 값.");
		}
		//참조타입//
		String str1 = new String("홍길동");//인스턴스.
		String str2 = new String("홍길동");//인스턴스.
		str1= null;
		str1= "김길도";
		
		
		if(str1.equals(str2)) { //참조변수인 경우 ==로 비교하면 주소값으로 비교하기 때문에
			             //다름 값으로 비교하고싶으면 equals라는 메소드를 사용해서 비교를 해야한다.
			System.out.println("같은 값.");
			}
			else {
				System.out.println("다른 값.");
			}
		
		
	}

}
