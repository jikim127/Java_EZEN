package ex03;

/* 다음과 같은 실행결과를 얻도록 보드를 완성하시오.
 * 
 * 메서드명:action
 * 기 능 주어진 객체의 메서드를 호줄한다:
 * DanceRobot, dance(), 인 경우를 호출하고
 * SingRobot, sing(), 인 경우를 호출하고
 * DrawRobot, draw(), 인 경우를 호출한다.
 * 반환타입 없음 :
 * 매개변수 인스턴스 또는 자손의 인스턴스
 * 
 *출력결과
 *춤을춥니다.
 *노래를 합니다.
 *그림을 그립니다.
 */

public class Exam01 {

	static void action (Robot r) { // like... int[] num = new int[]; (int=Robot) Line 38번에서 보낸걸 21번에 Robot r 로 받음.
		
		if(r instanceof DanceRobot) { //r가 DanceRobot객체를 참조하거나 DanceRobot를 상속하고 있는 객체이면 true)
			DanceRobot d =(DanceRobot)r;
			d.dance();
		}else if(r instanceof SingRobot) {
			SingRobot s =(SingRobot)r;
			s.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
public static void main(String[] args) {

   Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };
   for (int i = 0; i<arr.length;i++) {
      action(arr[i]);
   }
}
}


class Robot {}

class DanceRobot extends Robot {
void dance() {
   System.out.println("춤을 춥니다.");
}
void action() {
   dance();
}
}

class SingRobot extends Robot {
void sing() {
   System.out.println("노래를 합니다.");
}
void action( ) {
   sing();
}
}

class DrawRobot extends Robot {
void draw() {
   System.out.println("그림을 그립니다.");
}
void action() {
   draw();
}
}
