package ex01;

/*조원3명 자바점수를 입력받아서 출력하는 프로그램 작성
 * 자바점수 배점은 랜덤함수 이용해서 50~100 값이 저장되도록 한다.
 * 각 조원의 이름과 개별 점수. 조원 총점. 평균을 출력한다.
 * 
 * 이 형식은 사람수가 많을때 유용함, 단지 조원들 이름은 출력 안됨.
 */


public class Exam03 {

	public static void main(String[] args) {

		int sum=0;
		
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int[] arrNum = {10,20,30};
		
		for(int i=0; i<3; i++)
			sum += arrNum[i];
		System.out.println(sum);
		
	}

}
