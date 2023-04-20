package ex01;

class A{
	int a=10;
	void func() {
		System.out.println("A - a : " + a);
	}
}

class B extends A{
	int a=20;
	void func2() {
		System.out.println("B - b " + a);
	}
}



public class Exam01 {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.a);
		b.func();
		b.func2();
		System.out.println("---------------------");
		b.func();
		
		System.out.println(b.toString());
		
		A a = new A();
		System.out.println(a.toString());
		
		Object c = new Object();
		System.out.println(c.toString());
		
		
		Object oa = new A();
		Object ob = new B();
		System.out.println(oa.toString());
		System.out.println(ob.toString());
		
		
		
	}

}
