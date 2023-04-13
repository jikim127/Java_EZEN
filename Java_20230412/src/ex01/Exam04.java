package ex01;

/*1. int 배열 10개 생성
 *2. 랜덤함수 이용해서 10개 초기화.
 *3. 최대값, 최소값 출력 (1~100까지 수)
 */

public class Exam04 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int max;
		int min;
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		
		max = min = num[0]; // max=61일때
		
		for(int i=0; i<num.length; i++) { 
			if(num[i] > max)   //61 > 61 거짓이니 밑으로 안찍고 다시 다음값. //96 > 61max 참이니 아래로 가서            
				max = num[i];  //max=96저장. 다시 위로가서 다음값 29 > 96max 거짓이니 다시 다음값.
			if(num[i] < min)
				min = num[i];
			
			
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
