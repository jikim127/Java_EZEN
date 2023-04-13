package ex01;

/*

구구단

행 i : 8 (2~9단)
열 j : 9 (1~9)

*/

public class Exam05 {

	public static void main(String[] args) {

			
//		for(int i=2; i<=9; i++)
//			for(int j=1; j<=9; j++)
//				System.out.printf("%d x %d = %2d\n", i,j,i*j);
//		
		
		
		for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++)
					System.out.println(i + " x " + j + " = " + (i*j));
			
			
		}
	}
}

