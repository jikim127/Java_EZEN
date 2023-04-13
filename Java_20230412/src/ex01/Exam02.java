package ex01;

/*조원3명 자바점수를 입력받아서 출력하는 프로그램 작성
 * 자바점수 배점은 랜덤함수 이용해서 50~100 값이 저장되도록 한다.
 * 각 조원의 이름과 개별 점수. 조원 총점. 평균을 출력한다.
 * 
 * 이 형식은 사람수가 많을때 유용함, 단지 조원들 이름은 출력 안됨.
 */


public class Exam02 {

	public static void main(String[] args) {

		final int MAX = 3;
		int sum = 0, max;
		double avg = 0;
		
		int [] 조4 = new int[MAX];
		
		for(int i=0; i<MAX; i++) {
			조4[i] = (int)(Math.random()*50+1)+50;
		}
		
		for(int i=0; i<MAX; i++)
			sum += 조4[i];
		avg = sum/3.0;
		
		for(int i=0; i<MAX; i++)
			System.out.print(조4[i]+", ");
		
		System.out.println();
		System.out.println(sum+", "+avg);
		
	}

}
