package ex07;

class Box<T> {
	T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		ob = o;
	}
}

public class GenericInheritance {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<Integer>(100);
		Box<String> sBox = new SteelBox<String>("korea");
		Box<Integer> iiBox = new SteelBox("kim");
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		System.out.println(iiBox.get());
		
	}
}
