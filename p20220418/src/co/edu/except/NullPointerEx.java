package co.edu.except;

public class NullPointerEx {

	public static void main(String[] args) {
		String str = "hello";
		str = null;
		try {
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			//예외처리
			System.out.println("null값을 참조");
		}
		System.out.println("end of prog");
	}
}
