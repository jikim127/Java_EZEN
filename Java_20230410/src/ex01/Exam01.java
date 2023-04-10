package ex01;

// 1~10까지의 합을 누적.

public class Exam01 {

	public static void main(String[] args) {

		int total = 0;
		int num = 5;
		
		for(int i=1; i<=num; i++) // for(int 초기; 검사; 증가)
			total += i;           // total = total + i; 수행문장
		
		System.out.println("1~" + num + "까지 합 : " + total);
		
		
		/* for(int [1번]i=1; [2번][5번][5-6-7번 순서로 이 조건이 거짓이 될 때까지 반복]i<=num; [4번][7번]i++)
		 * 	[3번][6번]total += i;
		 * 
		 * i = 1, total = 0
		 * i = 2, total = 1
		 */
		
	
		
		
	}

}
