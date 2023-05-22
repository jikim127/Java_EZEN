package ex01;

public class Exam5x06 {

	public static void main(String[] args) {
		
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		int mon = 0;
		for(int i=0; i<coinUnit.length; i++) {
			 mon = (int)(money / coinUnit[i]);
			 money -= coinUnit[i]*mon;  
			 
			 System.out.println(coinUnit[i]+"원: "+mon+"개"); 
		}
	}
}
 