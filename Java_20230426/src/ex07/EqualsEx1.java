package ex07;

class  Value {
	int value;
	String name;
	
	public Value(String name, int value) {
		this.value = value;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[name : " + name + ", value : " + value + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Value m = (Value)obj;
		
		if(this.value == m.value)   // this.value <== v1의 값이 들어가있음. obj <== v2의 주소값이 들어가있음.
			return true;
		else
			return false;
		
//		return this.value == ((Value)obj).value ? true : false;
		
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {

		Value v1 = new Value("kim", 10);
		Value v2 = new Value("park", 10);
		
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));   // 저 위에 override 안하면 이거 false 나옴.
		System.out.println("--------------------------------------------");
		System.out.println(v1.toString());
		System.out.println(v1);
		System.out.println(v2); 
	}

}
