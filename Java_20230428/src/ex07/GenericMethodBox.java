package ex07;


class A {}
class B extends A {}
class C extends B {}
class D extends B {}


class Box<T> {
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}
	 

class Unboxer {
//	public static void peekBox(Box<? extends B> box) {  // 상한 제한..
	public static void peekBox(Box<? super B> box) {  // 하한 제한..
		System.out.println(box.getOb());
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		Box<D> dBox = new Box<>();
		Box<Object> iBox = new Box<>();
		
		Unboxer.peekBox(aBox); 
		Unboxer.peekBox(bBox);
//		Unboxer.peekBox(cBox); //에러남. B의 상위로만 들어갈수 있음. 하한제한을 걸어뒀기때문.
//		Unboxer.peekBox(dBox); //에러남. B의 상위로만 들어갈수 있음. 하한제한을 걸어뒀기때문.
		Unboxer.peekBox(iBox);
		
		
	}
}


