package ex01;

public class FunctionExam03 {

// 3. 더하기 : 반환타입 o, 매개변수 존재 x
// 3. 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력.
				
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int result =add();
		System.out.println(result); // 
		
		double df =convertInt();
		System.out.println((int)df);
		
		System.out.println("프로그램 끝");
	}

	 
// 3.	
		static int add() {
			int result = (10+20);
			return result;
			 
		}
		
// 3.	
		static double convertInt(){
			return 1.1;
				
		}
	
}

