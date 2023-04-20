package ex07;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) { //public이 붙으면 생성자!
		this.name = name;
		this.age = age;
	}
	void info() {  //메서드, 함수
		System.out.println(name+", "+age);
	}
}


class 구본우 extends 사람{
	double weight;
	
	public 구본우(String name, int age, double weight) {
		super(name, age);
		this.weight = weight;
	}
	
//	public 구본우(String name, int age, double weight) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
	void display() {
//		System.out.println(name+", "+age+", "+weight);
	}
}

class 추명선 {
	double height;
	
//	public 추명선(String name, int age, double height) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//	}
	void display() {
//		System.out.println(name+", "+age+", "+height);
	}
}

class 박종진{
	String grade; //학점
	
//	public 박종진(String name, int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
	void display() {
//		System.out.println(name+", "+age+", "+grade);
	}
}

public class Exam01 {
	
	public static void main(String[] args) {
		
		구본우 규 = new 구본우("로이", 11, 120);
		규.info();
		
//		추명선 츄 = new 추명선();
//		츄.info();
	}

}




