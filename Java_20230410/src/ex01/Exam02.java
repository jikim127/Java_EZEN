package ex01;

public class Exam02 {

	public static void main(String[] args) {

		//1~100 홀수 갯수
		
//		int count = 0;
//		
//		for(int i = 1; i <= 100; i++)
//		
//			if (i % 2 != 0) {
//				
//			System.out.print("1~100까지의 홀수 갯수 : ");
//			}
//			count++;
//		

	int count = 0;
	
	for(int i=1; i<=100; i++) { // for(int i=1; i<=100; i += 2)
		if(i%2==1) { // 그리고 if 안써줌
		System.out.print(i + ", ");
		
		}
			count++;
	}
	
	System.out.println("\n1~100사이 홀수의 갯수는 : " + count);
	
	}
}
