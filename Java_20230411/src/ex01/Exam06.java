package ex01;

/*



*/

public class Exam06 {

	public static void main(String[] args) {

		int i=0; //<--초기
		int sum=0;
		
		//for(초기; 검사; 증가)
		while(i<10) { //<--검사
			i++;   //<--증가
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("========================================");

//구구단 while문으로 바꾸기//
		
		int k=2;
		int m=1;
		
		while(k<=9) {
			m=1; // 이거 안쓰면 2단밖에 안나옴.
			while(m<=9) {
				System.out.printf("%d x %d = %d\n", k,m,k*m);
				m++;
		}
		k++;
			
		}
	}
}
