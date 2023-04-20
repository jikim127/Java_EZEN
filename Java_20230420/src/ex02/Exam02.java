package ex02;

class A{
    int a=10;
    void func() {
        System.out.println("A - a : " + a);
    }
    public String toString() {
        return "A의 toString 값";
    }
}

class B extends A{
    int a=20;
    void func2() {
        System.out.println("B - b " + a);
    }
    public String toString() {
        return "B의 toString 값";
    }
}

public class Exam02 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A aa = new B();
        B bb = new B();
//        B b = new A(); // 안됨. 상위클래스는 하위클래스를 참조할수 있지만 역은 안됨.
        Object ob = new B();
        Object ob1 = new A();
        
        System.out.println(a.toString()); // "A의 toString 값" 출력
        System.out.println(b.toString()); // "B의 toString 값" 출력
        System.out.println(aa.toString()); // "B의 toString 값" 출력
        System.out.println(bb.toString()); // "B의 toString 값" 출력
        System.out.println(ob.toString()); // "B의 toString 값" 출력
        System.out.println(ob1.toString()); // "A의 toString 값" 출력
    }
}





