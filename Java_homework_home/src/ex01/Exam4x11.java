package ex01;

////// 미완성

public class Exam4x11 {

	public static void main(String[] args) {
		
		//Fibonnachi 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 3번째값
		System.out.println(num1+","+num2);
		
		int n = 0;
		
		for(int i=0; i<8; i++) {
				if(i <= 1) {
					return;
				}
				else
					num3 = num3 + i;
				
			System.out.println(","+num3);
		}
	}
}
