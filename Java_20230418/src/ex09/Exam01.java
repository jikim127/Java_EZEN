package ex09;

class Parent {
	public String nation;      //10) String "대한민국";
	
	public Parent() {   //5) 
		this("대한민국");  //6) 이 포멧으로 나오는 값을 찾아감.
		System.out.println("Parent() call");  //11) 프린트 - 2번째
	}
	
	public Parent(String nation) {  //7) 
		this.nation = nation;       //8) 오른쪽 nation에 "대한민국"이 입력되어지고 왼쪽에 저장이됨.
		System.out.println("Parent(String nation) call"); //9) 프린트 - 1번째
	}
}
class Child extends Parent {  //3) Child가 Parent로 상속을 받고 있는걸 확인
	public String name;     //16) String "홍길동";
	                        //4) 보이진 않지만 super(); 가 디폴트 생성, 상위로 간다.
	public Child() {        //2) 
		this("홍길동");       //12) Parent를 거치고 처음 호출했던 Child 로 복귀, 해당 포멧으로 다시 찾아감.
		System.out.println("Child() call"); //17) 프린트 - 4번째
	}
	
	public Child(String name) {  //13)
		this.name = name;        //14) 오른쪽에 "홍길동"을 넣어주면 왼쪽에 저장됨.
		System.out.println("Child(String name) call"); //15) 프린트 - 3번째
	}
}


public class Exam01 {
	
	public static void main(String[] args) {
		
		Child child = new Child();  //1) 같은 type에 Child 생성자를 찾아간다.
	}
}

