package co.edu.nested;

//중첩 클래스 만들어 보기.
public class Outer {

	private String f1;

	// 클래스 안에 클래스 = 멤버클래스.(인스터스 멤버클래스)
	 class  Inner1 {

		String f2;

		void method2() {
			System.out.println("method2() call.");
		}
		
	 }
	//정적 static 멤버 클래스
		static class Inner2{
			String f4;
			static String f5;
			void method4() {
				System.out.println("method4() call.");
			}
			static void method5() {
				System.out.println("method5() call.");
			}
		}


	public void method1() {
		System.out.println("method1() call.");
		// 메소드 안에 클래스 = 로컬클래스.

		class Local {
			String f3;

			void method3() {
				System.out.println("method3() call.");
			}
		}
		
		Local local = new Local();
		local.method3();
	}

}
