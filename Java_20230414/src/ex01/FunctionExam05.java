package ex01;

public class FunctionExam05 {

// 함수를 호출하면서 인자값 하나 전달(정수)하면 함수는 1부터 전달한 인자값까지 더해서 
// 더한 결과값을 호출함수에게 반환해서 출력.
				
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int total = sumFuction(21);
		System.out.println("총합은 : "+ total);
		
		if(total %2 == 0) 
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
			
		
		System.out.println("프로그램 종료");
	}	
	
	static int sumFuction(int num) {
		int sum = 0;
		
		for(int i=1; i<=num; i++)
			sum += i;
				
			return sum;
			
		}
		
		
	}	
	

