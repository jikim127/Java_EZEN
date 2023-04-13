package ex01;

/*

    +
   ++
  +++
 ++++
+++++

행 : i
열 : j

*/

public class Exam04 {

	public static void main(String[] args) {

//		for(int i=0; i<5; i++) {
//			for(int j=0; j<4-i; j++)
//				System.out.print(" ");
//			for(int k =0; k<1+i; k++)
//			System.out.print("+");
//			System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<4-i)
					System.out.print(" ");
				else
					System.out.print("+");
			}
			System.out.println();
			
			
			
			
		}
		
	}

}
