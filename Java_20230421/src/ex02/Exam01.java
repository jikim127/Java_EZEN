package ex02;

import java.util.Arrays;

class Buyer {
	   int money = 1000;
	   Product[] cart = new Product[3];
	   int i = 0;
	   int count=0;
	   int j=0;
	   String 물건;
	   
	   void buy(Product P) {
		      if(money >= P.price) {
		         money -= P.price;
		         add(cart[i]);
		         i++;
		      }
		      else
		    	  System.out.println("잔액부족");
		         
		   }
		   
	   void add(Product P) {
		       
		   if(i>=cart.length) {
		         Product[] cart1 = new Product[cart.length*2];
		         for(int k = 0; k<i; i++) {
		            cart1[k] = cart[k];
		         }
		         for(int j =0; j < i; j++) {
		            Product[] tmp = new Product[100];
		            cart1[j] = cart[j];
		            tmp[j] = cart1[j];
		            cart[j] = tmp[j];
		            P = cart[i];
		         }
		      }else {
		         P = cart[i];
		      }
		   }

	   void summary() {
		   System.out.println("장바구니에 담긴 물건 : "+Arrays.toString(cart));
		   System.out.println("장바구니에 담긴 물건들의 가격 총합 : ");
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
	}
}