package ex01;

public class Exam03 {

	public static void main(String[] args) {

		//int num = 1;
		//int sum = 0;
		//num++; //뒤에 다 같음 ++num; / num += +1; / num = num+1;
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		tmp = ++num;
		sum = num++;
		
		System.out.println("tmp : " + tmp);
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}

}
