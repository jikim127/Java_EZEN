package ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("프로그램 종료");

	}

	private static void printLength(String data) {
		int result = 0;
		
		
		try {
		result = data.length();
		}catch(NullPointerException e) { 
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();  ///////// 위에 두개보다 이게 더 자세히 알려줘서 이걸 자주씀.
		}
		System.out.println("문자수 : " + result);
	}
}
