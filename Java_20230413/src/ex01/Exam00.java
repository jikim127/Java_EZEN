package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*1. 배열10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
 *2. 배열10개 총점과 평균을 구한다.
 *3. 배열10개 최대값, 최소값을 구한다.
 *4. 배열10개 오름차순 정렬을 한다. 
 */

public class Exam00 {

	public static void main(String[] args) {

		int[] random = new int[10];
		
			
		//랜덤번호 생성	
		for(int i=0; i<random.length; i++) {
			random [i] = (int)(Math.random()*100+1);
		}
		
		//총점과 평균
		int total = 0;
		for(int i=0; i<random.length; i++)
			total += random[i];
		
		int avrg = total/random.length;
		
		//최대값과 최소값
		int max, min;
		max = min = random[0]; 
		
		for(int i=1; i<random.length; i++) {
			if( random[i] > max)
				max = random[i];
		}
		
		for(int i=1; i<random.length; i++) {
			if( random[i] < min)
				min = random[i];
		}	
				
		//오름차순 정렬
		for(int i=0; i<random.length; i++) {
			for(int j=i+1; j<random.length; j++) {
				if(random[i] > random[j]) {
					int tmp = random[i];
					random[i] = random[j];
					random[j] = tmp;
				}
			}
		}
		
		
		//출력
		for(int i=0; i<random.length; i++)
			System.out.print(random[i]+", ");
			
		System.out.println();
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(double)avrg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println(Arrays.toString(random));
	}

}
