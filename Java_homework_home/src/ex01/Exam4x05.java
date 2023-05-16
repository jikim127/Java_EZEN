package ex01;

/// 미완성

public class Exam4x05 {

	public static void main(String[] args) {
		
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
		
		int i = 0;
		int count = 0;
		
		while(i >= 0) {
			
			if(i == count) {
				System.out.println();
				count++;
				
				i++;
				System.out.print("*");
				count = i;
			}
			else if(i > 10) {
				break;
			}
		}
	}
}
