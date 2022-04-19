package co.edu.interfaces;

public class RemoteExample {

	public static void main(String[] args) {

		// 상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.

		RemoteControl rc = new Television(); // remotecontrol을 구현하는 television

		rc.turnOn();

		rc.turnOff();

		rc.volumeUp();

		rc.volumeDown();

		rc.adjustScreen();

		RemoteControl.changeBattery();
		rc = new Audio();
		
		rc.turnOn();

		rc.turnOff();

		rc.volumeUp();

		rc.volumeDown();

		rc.adjustScreen();
	}

}
