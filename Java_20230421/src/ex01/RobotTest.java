package ex01;

public class RobotTest {

	static void action (Robot r) {
		
		if(r instanceof DanceRobot) {   //r가 DanceRobot 객체를 참조하거나 DanceRobot를 상속하고 있는 객체이면 true)
			DanceRobot d = (DanceRobot)r;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()}; // Robot 
		for(int i=0; i<arr.length; i++) {
			action(arr[i]);
		}
	}

}



class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
	void action() {
		dance();
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다");
	}
	void action() {
		sing();
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
	void action() {
		draw();
	}
}

