package ex06;

public class Car {
	private Tire tire = new Tire();
	
	//////////////////// 익명자식객체 -> 부모클래스를 상속받아 아래같이 생성됨.
	private Tire tire2 = new Tire() {
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
		public void test() {         // 이건 접근할수 없고, 차
			System.out.println("익명 자식 test");
		}
	};
	
	public void run1() {
		tire.roll();
		tire2.roll();
//		tire2.test();
	}
	
	public void run2() {
		Tire tire = new Tire() {    /// ; 로 끝내지 않고 {바디}를 넣어서 Tire를 상속을 받고 그 안에있는 roll을 자식으로 만들어 사용함.
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러감");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) { tire.roll(); }
}
		
		
