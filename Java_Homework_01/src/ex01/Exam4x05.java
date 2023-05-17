package ex01;

public class Exam4x05 {

	public static void main(String[] args) {
		
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
		
		int i = 0;
		
		while(i<=10) {
			int j = 0;
			
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
