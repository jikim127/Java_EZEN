package ex01;

public class Exam4x8 {

	public static void main(String[] args) {

		int x=0;
		int y=0;
		
		for(x=0; (x>=0 && x<=10); x++) {
			for(y=0; (y>=0 && y<=10); y++)
				if((2*x)+(4*y)==10)
					System.out.println("x = "+x+", y = "+y);
		}
	}
}
