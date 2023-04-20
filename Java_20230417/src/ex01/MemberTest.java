package ex01;


class Member {
	static int count; // 클래스변수, 정적변수
	String name;
	String id; // 인스턴스변수... 변수/멤버변수
	String pw;
	int age;
	
	//static이 붙으면 클래스메소드, 정적메소드 
	static void checkOut() {
	}
	
	//인스턴스 메소드
	boolean login(String id, String pw) {  // 여기서 id는 지역변수
		
		if(id.equals("hong") && pw.equals("12345"))
			return true;
		else return false;
	}
	
	//인스컨스 메소드
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
		
	}
}

public class MemberTest {

	public static void main(String[] args) {

		Member m = new Member();
		
		boolean b = m.login("로이", "1234");
		if(b == true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		boolean b2 = m.login("hong","12345");
		if(b2 == true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		m.logout("hong");
		
		
	}

}
