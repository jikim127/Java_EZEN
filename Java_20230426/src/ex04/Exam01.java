package ex04;

public class Exam01 {

	public static void main(String[] args) {
		
		try {
			findClass();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

	private static void findClass() throws ClassNotFoundException {
			Class.forName("java.lang.String2");
	}
}
