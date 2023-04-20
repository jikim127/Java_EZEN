package ex01;

//296P

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {                                          //생성자
		this("white", "auto", 4);
	}
	Car(String color) {                              //생성자
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {  //생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}



class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("cl의 color="+ c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+ c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		
	}

}
