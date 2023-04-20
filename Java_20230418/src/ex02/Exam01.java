package ex02;

class Member {
	private String name; //private = 내부 package 안에서만 접근가능. 외부에서 접근못함.
	private int age;
	
	void display() {
		System.out.println(name+", "+age);
	}

	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
		else
			age = 1;
	}
}

// 정적변수. 정적메소드는 공유자원이면서 지들끼리만 데이타주고 받을 수 있다.

public class Exam01 {

	public static void main(String[] args) {

		Member s1 = new Member();
		s1.setData("김지민",20); // 함수호출로만 private 의 정보를 바꿔줄수 있다.
		
//		s1.name = "김지민";
//		s1.age = 20;
		
		Member s2 = new Member();
		
		s1.display();
		s2.display();
		
	}

}
