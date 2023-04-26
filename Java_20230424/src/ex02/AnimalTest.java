package ex02;

abstract class Animal {   // 추상클래스 ////////////////////////////////
	abstract void makeSound() ;     // abstract을 붙여서 추상메소드 //////// 공통의 기능을 뽑아서 하나의 클래스를 만듬 //////////////////////////
//	}                               // 추상 메소드화 시키기 위해 뒤에 {바디문} 괄호 없애고, ;로 마무리.
}

class Cat extends Animal {
	void makeSound() {         // 그리고 같은 메서드로 override 해줌. (makeSound())///////////
		System.out.println("야옹~야옹~");
	}
}
class Dog extends Animal {

	@Override             // @어노테이션 --> 붙이는것을 권장.  override --> 상위클래스는 재정의 하겠다는 적극적 표현.
	void makeSound() {
		
	}
//	void makeSound() {
//		System.out.println("멍멍~멍멍~");
//	}
	
}
class Pig extends Animal {
	@Override
	void makeSuond() { //오타나서 override 에러를 못찾아 낼수도 있는데 @어노테이션을 붙임으로써 에러를 잡아낼수 있음.
		System.out.println("꿀꿀~꿀꿀~");
	}
}
class Rabbit extends Animal {
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}
class Tiger extends Animal {
	void makeSound() {
		System.out.println("어흥~어흥~");
	}
}

// 동물들의 짖는소리
public class AnimalTest {

	public static void main(String[] args) {
		 Animal[] animals = {new Cat(), new Dog(), new Pig(), new Rabbit(), new Tiger()};
		 
		 // 일반 for 문 /////////////////////////////////////////////////
		 for(int i=0; i<animals.length; i++)
			 animals[i].makeSound();
		 
		 //향상된 for 문 ////////////////////////////////////////////////
		 for(Animal animal : animals)           // (클래스이름 단수 : 복수)
			 animal.makeSound();
		 
		 System.out.println("---------------------------");
//		 Animal an = new Animal(); // <=========== class Animal 앞에 abstract을 붙임으로서 객체를 생성할 수 없도록 막아놓음.!
		 Dog d = new Dog();
		 d.makeSound();
		 
	}

}
