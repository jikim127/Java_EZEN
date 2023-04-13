package ex01;

/*1. int 배열 10개 생성
 *2. 랜덤함수 이용해서 10개 초기화.
 *3. 최대값, 최소값 출력 (1~100까지 수)
 */

public class Exam06 {

	public static void main(String[] args) {

		int[] num = new int[10]; //정수가 들어갈 수 있는 10개의 공간을 설정함.
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i]+", ");
		}
		System.out.println();	
		
		System.out.println("오름차순 정렬!!!!");
		
		
		for(int i=0; i<num.length; i++)          //i=1,
//			for(int j=i+1; j<num.length; j++) {  //j=2, j=1 i=0
			for(int j=0; j<num.length; j++) {    //이렇게 해도 답은 나오지만 굉장히 더럽게 나와짐. 위에 식은 제일 작은수가 fixed 되서 그 뒤에 수를 구하는데
				if(num[i] < num[j]) {            //지금 이 식은 제일 작은수가 언제 fixed 될지 모름.
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
					
				}
				
			}
					
			for(int i=0; i<num.length; i++)	
					System.out.print(num[i]+", ");
					
		}
		
		
	}

