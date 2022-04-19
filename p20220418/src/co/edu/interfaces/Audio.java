package co.edu.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("오디오 소리를 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("오디오 소리를 내립니다.");
	}


	
	
}
