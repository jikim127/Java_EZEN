package ex03;

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

class box {     //  담는 박스
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}



public class FruitAndBox {

	public static void main(String[] args) {
		
		box aBox = new box(); // 사과 담음
		box oBox = new box(); // 오렌지 담음
		
		aBox.setObj(new Apple());  //사과 저장
		oBox.setObj(new Orange());  //오렌지 저장
		
		Apple ap = (Apple)aBox.getObj();  //꺼내기
		Orange op = (Orange)oBox.getObj();  //꺼내기
		
		System.out.println(ap);
		System.out.println(op);
		
		
		

	}

}
