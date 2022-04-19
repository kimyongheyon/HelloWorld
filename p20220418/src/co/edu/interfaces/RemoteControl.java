package co.edu.interfaces;

public interface RemoteControl {

	//상수 
	public int MAX_VOLUME= 10;
	
	public void turnOn(); // 구현부분이 없는 메소드 추상메소드
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	public default void adjustScreen() {
		System.out.println();
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
