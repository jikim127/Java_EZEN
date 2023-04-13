package ex01;

/*로또 프로그램 만들기. (번호 6개)
 * 1~45까지 번호
 */

public class Exam070 {

	public static void main(String[] args) {

		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45+1);
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
				
		}
		
		System.out.println("이번주 로또번호 :");
		for(int i=0; i<6; i++)
			System.out.println(lotto[i] + ", `");
		
		}
		
		
	}

