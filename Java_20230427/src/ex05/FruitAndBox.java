package ex05;

class Apple {
	public String toString() {
		return "I am apple";
	}
}

class Orange {
	public String toString() {
		return "I am orange";
	}
}

class box<T> {     //  담는 박스
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) { //Object는 생성된 객체의 주소값만 받아줄 수 있음//
		this.obj = obj;
	}
}


public class FruitAndBox {

	public static void main(String[] args) {
		
		box<Apple> aBox = new box<Apple>(); // 사과 담음
		box<Orange> oBox = new box<Orange>(); // 오렌지 담음
		
//		aBox.setObj(new Apple());  //사과 저장
//		oBox.setObj(new Orange());  //오렌지 저장
		aBox.setObj(new Apple());  ////// 위에처럼 써야하는데 실수로 이렇게 입력했을 경우//////
		oBox.setObj(new Orange());  
		
//		Apple ap = (Apple)aBox.getObj();  //꺼내기
//		Orange op = (Orange)oBox.getObj();  //꺼내기
		
//		System.out.println(ap);
//		System.out.println(op);
		System.out.println(aBox.getObj());
		System.out.println(oBox.getObj());
		
	}
}
