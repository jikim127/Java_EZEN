package ex01;

public class Exam100 {

	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		int count = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = ++count;
				System.out.print(num[i][j]+", "); //같은거 == System.out.printf("%2d, ", num[i][j]);
			}
			System.out.println();
		}
	}

}
