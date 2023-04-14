package ex01;

/* 함수 ==> 내가 생각한 함수는?? 바로가기!! 바로가기 아이콘으로 바로 실행하게 하는 느낌?
 * 
 * String main(int num){
 * 	return "문자열"; // void가 없으면 무조건 return이라는게 같이 와야함.
 * 
 * 
 * void main(){
 * }
 * 
 * void: 반환타입이 없다는 뜻, main: 함수명, (): 매개변수 타입
 * {}: 함수가 수형 문장
 * 
 * 함수의 경우의 수는 4개. (입력&출력 있고, 입력만 출력없고, 입력없고 출력만, 입력&출력 없고)
 */

public class FunctionExam01 {

// 1. 더하기 : 반환타입 존재, 매개변수 존재(2개)
// 1. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.
				
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = add(10, 20);  // return되어 온 값 30이 여기 저장되고 끝남. 
		                        // 그래서 이걸 받아줄 변수가 필요함. int num = add(10,20) 이렇게 설정 필요.
		int number = convertInt(10.2);
		
		
		System.out.println("프로그램 끝"+", "+num+", "+number);
	}

	
// 1.	
		static int add(int n1, int n2){
			System.out.println("add함수 시작");
			int result = n1 + n2;
			return result;
		}

// 1.
		static int convertInt(double f) {
			int result = (int)f;
			return result;
		}
	
}

