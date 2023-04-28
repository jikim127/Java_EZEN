package ex02;

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

class Applebox {     //  사과 담는 박스
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}

class Orangebox {   //  오렌지 담는 박스
	private Orangebox or;


	public Orangebox getOr() {
		return or;
	}

	public void setOr(Orange orange) {
		this.or = or;
	}
}


public class FruitAndBox {

	public static void main(String[] args) {
		
		Applebox aBox = new Applebox();
		Orangebox oBox = new Orangebox();
		
		aBox.setAp(new Apple());
		oBox.setOr(new Orange());
		
		Apple a = aBox.getAp();
		Orange o = oBox.getOr();
		System.out.println(a);
		System.out.println(o);
		
		
		

	}

}
