package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 */

public class Exam01 {

	public static void main(String[] args) {

		int[] arrNum = {10, 20, 30,40,50};
		System.out.println(Arrays.toString(arrNum)); //1번라인
		
		int[] arrNum2 = new int[10];
		
		for(int i=0; i<arrNum.length; i++)
			arrNum2[i] = arrNum[i];
		
		System.out.println(Arrays.toString(arrNum2)); //2번라인
		
		arrNum = arrNum2;
		System.out.println(Arrays.toString(arrNum));  //3번라인
		
		
		int[] tmp = new int[10];
		
		tmp = arrNum; // tmp로 잡아놓은 배열공간을 무력화 시키고 참조 주소를 arrNum로 바꿔줌
		
		System.out.println(Arrays.toString(tmp));     //4번라인
		
		arrNum[3] = 100;    // tmp가 복사를 하는건지 arrNum 주소를 참조하는건지 알아보기위해.
		System.out.println(Arrays.toString(arrNum));  //5번라인
		System.out.println(Arrays.toString(tmp));     //6번라인
		
		System.out.println(tmp);    //주소를 링크한다는 증거
		System.out.println(arrNum); //주소를 링크한다는 증거
		System.out.println("------------------------------------------");

		int[] arr = {10, 20, 30,40,50};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr, 0, arr2, 2, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
	}

}
