package ex01;

/*로또 프로그램 만들기. (번호 6개)
 * 1~45까지 번호
 */

public class Exam07 {

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
		
		System.out.println("이번주 로또 번호는 : ");
		for(int i=0; i<6; i++)
			System.out.print(lotto[i]+", ");
		
		
//		int[] num = new int[6]; // 이 배열의 변수 이름은 num[xx] 이렇게 되는것 주의!
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = (int)(Math.random()*45+1);
//				System.out.print(num[i]+ ", ");
//		}
		
//		int lotto = 0;
//		
//		for(int i=0; i<6; i++) {
//			lotto = (int)(Math.random()*45+1);
//				System.out.print(lotto + ", ");
//		}
		
		}
		
		
	}

