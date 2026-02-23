package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

/*
23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29  
2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
 단 for문 사용하지 않고 Iterator로 처리
*/

public class IteratorNumMain {

	public static void main(String[] args) {
		int [] arr = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};
		ArrayList numList = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		ArrayList list5 = new ArrayList();
		
		for (int i=0; i<arr.length; i++) {
			numList.add(arr[i]);
		}
		
		Iterator it = numList.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			if ((int)obj % 2 == 0) {
				list2.add(obj);
			}
			if ((int)obj % 3 == 0) {
				list3.add(obj);
			}
			if ((int)obj % 5 == 0) {
				list5.add(obj);
			}
		}
		
		System.out.println("2: "+list2);
		System.out.println("3: "+list3);
		System.out.println("5: "+list5);
	}

}
