package ex01;

/*조원3명 자바점수를 입력받아서 출력하는 프로그램 작성
 * 자바점수 배점은 랜덤함수 이용해서 50~100 값이 저장되도록 한다.
 * 각 조원의 이름과 개별 점수. 조원 총점. 평균을 출력한다.
 */


public class Exam01 {

	public static void main(String[] args) {

		int 박종진 = (int)((Math.random()*50)+1)+50;
		int 김소휘 = (int)((Math.random()*50)+1)+50;
		int 김지민 = (int)((Math.random()*50)+1)+50;
		int total = 박종진+김소휘+김지민;
		double average = total/3;
		
		System.out.println("1. 박종진 : "+박종진);
		System.out.println("2. 김소휘 : "+김소휘);
		System.out.println("3. 김지민 : "+김지민);
		System.out.println("조 총점 : "+total);
		System.out.printf("조 평균 : %.2f",average);
		
		
			
	
			
		
		
		
	}

}
