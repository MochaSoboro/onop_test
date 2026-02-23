package coll_p;

import java.util.ArrayList;
import java.util.List;

/*
ArrayListNumMain
23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29  
2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
*/

public class ArrayListNumMain {

	public static void main(String[] args) {
		int [] arr = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};
		List arr2 = new ArrayList();
		List arr3 = new ArrayList();
		List arr5 = new ArrayList();
		
		for (int num : arr) {
			if (num % 2 == 0) {
				arr2.add(num);
			}
			if (num % 3 == 0) {
				arr3.add(num);
			}
			if (num % 5 == 0) {
				arr5.add(num);
			}
		}
		
		System.out.println("2의 배수"+arr2);
		System.out.println("3의 배수"+arr3);
		System.out.println("5의 배수"+arr5);
	}

}
