package ex03;



public class Exam03 {

	public static void main(String[] args) {
		
		Exam04 e = new Exam04();
//		ex04.num=100;  // private 이 붙어서 같은 class 에서만 접근가능. default는 안붙이면 다 default인데 같은 package안에서 접근가능.
		
		e.setNum(20);
		System.out.println("num : "+e.getNum());
	
		e.setName("Hello");
		System.out.println("name : "+e.getName());
	
	
	}

}
