package ex01;

// 인터페이스 선언
public interface RemoteControl {
	// 상수 (public static final 생략 가능)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드
	public void turnOn();
	public void turnOff();
//	public void setVolume(int n);
	
	// default 메서드 -- 인터페이스에서 사용. 구현클래스에서 override 해도되고 안해도 되고 선택가능.
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리");
		else
			System.out.println("무음처리 해제");
	}
	
	// 정적 메소드 (public 생략 가능)
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
