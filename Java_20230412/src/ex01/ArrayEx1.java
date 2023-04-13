package ex01;

/*조원3명 자바점수를 입력받아서 출력하는 프로그램 작성
 * 자바점수 배점은 랜덤함수 이용해서 50~100 값이 저장되도록 한다.
 * 각 조원의 이름과 개별 점수. 조원 총점. 평균을 출력한다.
 */


public class ArrayEx1 {

	public static void main(String[] args) {

		int [] score = new int [5];
		int k =1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];
		
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d] : %d%n",i,score[i]);
		}
		System.out.printf("tmp:%d%n", tmp);	
		System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난 값으로 에러남.
	}

}
