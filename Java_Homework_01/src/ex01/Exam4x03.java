package ex01;

public class Exam4x03 {

	public static void main(String[] args) {
		
		int tot = 0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++)
				tot = (tot)+j;
		} 
		
		System.out.println(tot);

	}
}
