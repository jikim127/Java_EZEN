package ex08;

interface Animal {
	void eat();
	public abstract void sleep();
//	void sound();   /////////이걸 추가하면 아래 override기능도 모두 다 구현해 줘야지 작동하기 때문에 번거로움.
	                /////////그래서 나온것이 default 메서드
	default void sound() {};  //// 아래에서 구현해도 되고 안해도 되고 선택권을 줌.
}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다");
	}

//	@Override
//	public void sound() {
//		System.out.println("고양이는 운다");
//	}
//	
//}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("강아지는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 잔다");
	}
	
}

public class Exam01 {

	public static void main(String[] args) {

//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		cat.eat();
//		dog.sleep();
		
		Animal an = new Dog();
		an.eat();
		an.sleep();
		
		an = new Cat();
		an.eat();
		an.sleep();
		
		
	}
}
