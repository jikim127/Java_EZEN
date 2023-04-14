package ex01;

public class FunctionExam02 {

// 2. 더하기 : 반환타입 x, 매개변수 존재(2개)
// 2. 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성.
				
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add(10,20); // void는 return이 받아줄 필요가 없으니 앞에 변수지정을 안해도 됨.
		
		add(1.1);
		
		System.out.println("프로그램 끝");
	}

	
// 2.	
		static void add(int num1, int num2){
			
			System.out.println("더하기 : "+(num1+num2));
		}
		
// 2.	
		static void add(double number){
				
			System.out.println("정수 : "+(int)(number));
		}
	
}

