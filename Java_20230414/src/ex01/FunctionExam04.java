package ex01;

public class FunctionExam04 {

// 4. 더하기 : 반환타입 x, 매개변수 존재 x
// 4. 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력.
				
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add();
		convertInt();
		
		System.out.println("프로그램 끝");
	}

	 
// 4.	
		static void add() {
			int result = (10+20);
			System.out.println(result);
			 
		}
		
// 4.	
		static void convertInt(){
			double result2 = 1.1;
			System.out.println((int)result2);
				
		}
	
}

