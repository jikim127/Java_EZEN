package ex01;

/*로또 프로그램 만들기. (번호 6개)
 * 1~45까지 번호
 * 오빠가 짬
 */

public class Exam09 {

	public static void main(String[] args) {
        int[] lotto = new int[6];
        int[] numberArr = new int[45];

        for (int i = 0; i < numberArr.length; i++)
            numberArr[i] = i + 1;

        //랜덤번호 생성
        for (int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 45);

            // 중복 숫자 제거
            while (numberArr[num] == 0)
                num = (int)(Math.random() * 45);

            lotto[i] = numberArr[num];
            
            // 사용한 놈은 0으로 제거
            numberArr[num] = 0;
        }

        //랜덤번호 출력
        System.out.print("이번주 로또 번호는 :");
        for (int i = 0; i < lotto.length; i++)
            System.out.print(", " + lotto[i]);

    }
		}
		
		

