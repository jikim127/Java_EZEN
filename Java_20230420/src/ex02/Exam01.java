package ex02;

class Unit {
	int x, y;
	void move(int x, int y) {}
	void stop () {}
}

class Marine extends Unit {
	void stimpack() {}
	void move(int x, int y) {
		System.out.println("걸어서 이동");
	}
}


class Tank extends Unit {
	void changeMode() {}
	void move(int x, int y) {
		System.out.println("탱크로 이동");
	}
}

class Dropship extends Unit {
	void load () {}
	void unload () {}
	void move(int x, int y) {
		System.out.println("배로 이동");
	}
}



public class Exam01 {

	public static void main(String[] args) {

		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		move(d);
		move(t);
		move(m);
		
	}
	
	static void move(Unit u) {
		u.move(10, 10);
	}
		
}

