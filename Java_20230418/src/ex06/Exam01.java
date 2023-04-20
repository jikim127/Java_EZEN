package ex06;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


class 구본우{
	String name;
	int age;
	double weight;
	
	public 구본우(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void display() {
		System.out.println(name+", "+age+", "+weight);
	}
	
}

class 추명선{
	String name;
	int age;
	double height;
	
	public 추명선(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	void display() {
		System.out.println(name+", "+age+", "+height);
	}
}

class 박종진{
	String name;
	int age;
	String grade; //학점
	
	public 박종진(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	void display() {
		System.out.println(name+", "+age+", "+grade);

	}
}

public class Exam01 {
	
	public static void main(String[] args) {
		추명선 츄 = new 추명선("홍틸동", 20, 178.4);
		츄.display();
		
		구본우 규 = new 구본우("까미", 15, 8);
		규.display();
	}

}




