package co.edu.statis;

public class Singleton {

	
//싱글톤
	
	private static Singleton singLeton = new Singleton();
	
		private Singleton() {
			
		}
		
		public static Singleton getInstance() { // 다 private을 걸어놔서 getInstance로만 생성자를 생성가능
			 //public을 걸면 다른 패키지에서도 이 생성자를 호출 가능하다.
			return singLeton;
		}
		
		
	}
	

