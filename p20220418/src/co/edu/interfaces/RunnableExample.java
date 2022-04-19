package co.edu.interfaces;



// 구현클래스  = 클래스명.
interface Runnable{
	public void run();
	
}
class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("움직입니다.");
	}
	
}
public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		
		
		runnable = new Runnable() {
			//익명구현객체 
			@Override
			public void run() {   
				System.out.println("멍멍이가 달립니다.");
			}  
			
		};
		runnable.run();
		
		// 익명구현객체. 람다표현식
		runnable = () -> System.out.println("야용이가 달립니다.");
		runnable.run();
		
	}
	
	
}
