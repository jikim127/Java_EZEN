package ex01;

class Bag {
	int capacity; //용량
	SunCream sun; //포함 관계
	public Bag() {
		System.out.println("Bag()");
	}
	void move() {
		System.out.println("가방 옮기다");
	}
	
}

class SunCream {
	int vol;
	public SunCream() {
		System.out.println("SunCream()");
	}
	void cover() {
		System.out.println("썬크림 바르다");
	}
}

public class MemberTest {

	public static void main(String[] args) {

		Bag bg = new Bag();
		bg.sun = new SunCream();
		bg.sun.cover();
	}

}
