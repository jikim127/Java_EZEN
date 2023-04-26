package ex02.copy;

import java.util.Arrays;

class Buyer {
	   int money = 1000;
	   Product[] cart = new Product[3];
	   int i = 0;
	   
	   void buy(Product P) {
		      if(money < P.price) {
		    	  System.out.println("잔액부족");
		    	  return;
		      }
		      else
		    	  money -= P.price;
		    	  add(P);  //구입한 물건은 Tv, Audio, Computer..
		      }
		   
	   void add(Product P) {
		       
		   if(i>=cart.length) {
		         Product[] tmp = new Product[cart.length*2];
		         System.arraycopy(cart, 0, tmp, 0, cart.length);  //p194 배열의 복사 참조.
//		         for(int j =0; j < cart.length; j++) {
////			            tmp[j] = cart[j];
		         cart = tmp;
		   }
		   cart[i] = P;
		   i++;
	   }
		         

	   void summary() {
		   System.out.print("장바구니에 담긴 물건 : ");
		   for(int i=0; i<cart.length; i++) {
		   	   System.out.print(cart[i]+", ");
		   }
		   System.out.println();
		   System.out.println("장바구니에 담긴 물건들의 가격 총합 : "+(1000-money));
		   System.out.println("물건을 사고 남은 금액 : "+money);

	   }
	}

	class Product {
	   int price;
	   
	   Product(int price){
	      this.price = price;
	   }
	}

	class Tv extends Product {
	   Tv() { super(100); }
	   
	   public String toString() { return "Tv";}
	}

	class Computer extends Product {
	   Computer() { super (200); }
	   
	   public String toString() { return "computer";}
	}

	class Audio extends Product {
	   Audio () { super (50); }
	   
	   public String toString () { return "Audio"; }
	}


public class Exam01 {

	public static void main(String[] args) {
	
	Buyer b = new Buyer();
	b.buy(new Tv());
	b.buy(new Computer());
	b.buy(new Tv());
	b.buy(new Audio());
	b.buy(new Computer());
	b.buy(new Computer());
	b.buy(new Computer());
	b.summary();

//-------------------------------------연습문제------------------------------------	
//	Product[] cart = new Product[3];
//	cart[0] = new Tv();
//	cart[1] = new Computer();
//	cart[2] = new Audio();
//	System.out.println(cart[0]);
//	System.out.println(cart[1].toString());
//	System.out.println(cart[2].toString());
	}
}
