package ex01;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}
	
	public void setMute(boolean mute) {   // default를 public으로 바꿔줘야 에러안남. 
		System.out.println("setMute()재정의 합니다");
	}
}
