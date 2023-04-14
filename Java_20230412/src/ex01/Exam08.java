package ex01;

/*로또 프로그램 만들기. (번호 6개)
 * 1~45까지 번호
 */

public class Exam08 {

	public static void main(String[] args) {


		int[] lotto = new int[6];
		//랜덤번호 생성
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//중복번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
//					break;
				}
			}
		
		}
		//랜덤번호 출력
		System.out.print("이번주 로또 번호는 :");
		for(int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + ", ");
		
		}
		
		
	}

