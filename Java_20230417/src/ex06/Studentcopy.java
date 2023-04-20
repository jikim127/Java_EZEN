package ex06;

class Student {
	String name;
	String address;
	int age;
	static int count;
	
	void displyInfo() {
		count++;
		System.out.println(name+", "+age+", "+address+", "+"현재 학생수 : "+count);
	}
	
}


public class Studentcopy {

	public static void main(String[] args) {

		Student kim = new Student();
			kim.name = "김지민";
			kim.age = 20;
			kim.address = "평택";
		
		Student lee = new Student();
			lee.name = "이젠";
			lee.age = 20;
			lee.address = "수원";
		
		Student park = new Student();
		Student hong = new Student();
		
		kim.displyInfo();
		lee.displyInfo();
		park.displyInfo();
		hong.displyInfo();
		
		
		
		
	}

}
