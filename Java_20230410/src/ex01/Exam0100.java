package ex01;

//1부터 100까지의 합중에서 2와 3의 배수인것만 도출해 내기.

public class Exam0100 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 100; i++) 
		{
		   if (i % 2 == 0 && i % 3 == 0) 
		   {
		      sum += i;
		      System.out.print(i+", ");
		   }
		}
		System.out.print("\nsum : " + sum);
}
}
