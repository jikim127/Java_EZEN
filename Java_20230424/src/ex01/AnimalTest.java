package ex01;

class Cat {
	void sound() {
		System.out.println("야옹~야옹~");
	}
}
class Dog {
	void makeSound() {
		System.out.println("멍멍~멍멍~");
	}
}
class Pig {
	void sound() {
		System.out.println("꿀꿀~꿀꿀~");
	}
}
class Rabbit {
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		 Cat cat = new Cat();
		 cat.sound();
		 
		 Dog dog = new Dog();
		 dog.makeSound();
		 
		 Pig pig = new Pig();
		 pig.sound();
		 
		 Rabbit rabbit = new Rabbit();
		 rabbit.makeSound();
		 
	}

}
