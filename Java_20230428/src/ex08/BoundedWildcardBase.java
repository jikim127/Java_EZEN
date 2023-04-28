package ex08;

class Box<T>{
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Toy {
	public String toString() {
		return "I am a Toy()";
	}
}

class BoxHandler {
	
	// outBox용도는 get기능 역활만 담당
	public static void outBox(Box<? extends Toy> box) {
		Toy toy = box.getOb();     //꺼내는 역할
		box.setOb(new Toy());      //set 처리가 된다.
		System.out.println(toy);
	}
	public static void inBox(Box<Toy> box, Toy n) {	
		box.setOb(n);   // 넣는 역할
	
	}
}

public class BoundedWildcardBase {

	public static void main(String[] args) {
		
		Box <Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
	}

}
