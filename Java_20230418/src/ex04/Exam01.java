package ex04;

class Member {
	private String name; //private = package 안에서만 접근가능. 외부에서 접근못함.
	private int age; //멤버변수
	
	
	// 디폴트 생성자는 자바가 직접 생성한다. 다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다.
	public Member(String name, int age) { //생성자(constructor)는 반환타입이 없음, class이름과 같다, 오버로딩 가능.
	//	name = name;      // <--------------- 내부이름과 외부이름이 같다면 내부것을 먼저 사용.
		this.name = name; // <--------------- this를 붙임으로써 밖에있는 이름으로 가져와짐.  
		this.age = age;   // <--------------- 
		// this의 용도 : 
		//1. 지역변수와 멤버변수가 충돌날 때 this를 붙이면 멤버변수를 의미.
		//2. 생성자를 찾을 때.
		
	}
	public Member() {
		this("미정의",1);
	}
	
	Member(String name) {
		this(name,1);
	}
		
	void display() {
		System.out.println(name+", "+age);
	}

//	void setData(String n, int a) {
//		name = n;
//		if(a>=0 && a<=120)
//			age = a;
//		else
//			age = 1;
//	}
}

// 정적변수. 정적메소드는 공유자원이면서 지들끼리만 데이타주고 받을 수 있다.

public class Exam01 {

	public static void main(String[] args) {

		Member s1 = new Member("김지민", 20);

		
//		s1.name = "김지민";
//		s1.age = 20;
		
		Member s2 = new Member("이젠", 100);
		s1.display();
		s2.display();
		
		Member s3 = new Member();
		s3.display();
		
		Member s4 = new Member("이성진");
		s4.display();
	}

}
