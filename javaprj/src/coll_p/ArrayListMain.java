package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		int [] arr = {11, 22, 33, 44};
		
		List arr1 = new ArrayList();
//		List arr2 = new ArrayList(arr);  배열을 List로 바꾸는 건 안됨
		System.out.println("CRUD");
		System.out.println("arr1: "+arr1);
		
		arr1.add(10);
		arr1.add(5);
		arr1.add(30);
		arr1.add(10);
		arr1.add(40);
		arr1.add(5);
		
		System.out.println("arr1.add: "+arr1);
		
		arr1.add("나는무너");
		arr1.add(123.456);
		arr1.add(true);
		arr1.add(new int [] {987, 654, 321});
		arr1.add(new Date());
		arr1.add(new ArrayList());
		
		System.out.println("arr1.add: "+arr1);
		
		arr1.add(2, "아기상어");
		System.out.println("arr1.add: "+arr1);
		
		Object oo = arr1.get(1);	// 1 : index
		System.out.println("arr1.get: "+oo);
		
//		oo : arr1.get(13); 없는 index 요청에 에러
		
		oo = arr1.getFirst();
		System.out.println("getFirst: "+oo);
		oo = arr1.getLast();
		System.out.println("getLast: "+oo);
		System.out.println("size(): "+arr1.size());
		arr1.set(7, 1111);	// 같은 자료형이 아니어도 가능
		System.out.println("set: "+arr1);
		
//		arr1.set(15, "나는 상어");		없는 index에 set 불가능
		
		oo = arr1.remove(5);	// index 번호로 삭제
		System.out.println("remove: "+arr1);
		System.out.println("삭제한 요소: "+oo);	// 40
		boolean bo = arr1.remove("아기상어");	// "아기상어" 삭제됨
		System.out.println("remove: "+arr1);
		System.out.println("삭제 결과: "+bo);	// true
		bo = arr1.remove("엄마상어");	// 에러 미발생
		System.out.println("remove: "+arr1);
		System.out.println("삭제 결과: "+bo);	// false
		// 5를 삭제하고 싶을 때
		bo = arr1.remove((Object)5);	// int인 경우 index로 인식 -> Object로 형변환
										// 같은 요소가 여러개인 경우 앞에서부터 삭제
		System.out.println("remove: "+arr1);
		System.out.println("삭제 결과: "+bo);	// true
		
		oo = arr1.removeFirst();
		System.out.println("removeFirst: "+arr1);
		System.out.println("삭제한 요소: "+oo);	
		oo = arr1.removeLast();
		System.out.println("removeLast: "+arr1);
		System.out.println("삭제한 요소: "+oo);	
		
		System.out.println("조회");
		System.out.println("contains: "+arr1.contains(1111));	// true
		System.out.println("contains: "+arr1.contains(3333));	// false
		System.out.println("indexOf: "+arr1.indexOf(123.456));	// 4 (index 번호)
		System.out.println("indexOf: "+arr1.indexOf(987.654));	// -1	(존재하지 않음)
		
		arr1.add(5, 10);
		System.out.println("arr1: "+arr1);
		// [30, 10, 5, 1111, 123.456, 10, true, [I@5674cd4d, Mon Dec 22 10:35:36 KST 2025]
		System.out.println("indexOf: "+arr1.indexOf(10));	// 1
//		System.out.println("indexOf: "+arr1.indexOf(10, 2));
		System.out.println("lastIndexOf: "+arr1.lastIndexOf(10));
		
		System.out.println("추출");
		Object [] arr2 = arr1.toArray();
		System.out.println(Arrays.toString(arr2));
		
		List arr3 = arr1.subList(2, 6);		// shallow copy
		List arr4 = new ArrayList(arr3);	// deep copy
		System.out.println("arr3: "+arr3);
		System.out.println("arr4: "+arr4);
		System.out.println(arr1.subList(2, 6) == arr3);	// false
		System.out.println(arr1.subList(2, 6) == arr4);	// false
		
		arr1.set(4, 2468);	// 원본에서 변경 --> subList 변경
		System.out.println("arr1: "+arr1);
		System.out.println("arr3: "+arr3);	// [5, 1111, 2468, 10]
		System.out.println("arr4: "+arr4);	// [5, 1111, 123.456, 10]
		arr1.add(3, 5566);	// 원본에서 추가 --> subList 에러 발생 (연결 끊김)
		System.out.println("arr1: "+arr1);
//		System.out.println("arr3: "+arr3);	shallow copy로 원본과 연결이 끊김
		System.out.println("arr4: "+arr4);
		
		System.out.println("All");
		List arr5 = new ArrayList();
		arr5.add(100);
		arr5.add(300);
		arr5.add(100);
		arr5.add(400);
		
		arr1.addAll(arr5);
		System.out.println("addAll: "+arr1);
		
		List arr6 = new ArrayList();
		arr6.add(100);
		arr6.add(600);
		arr6.add(400);
		
		System.out.println(arr1.containsAll(arr5));	// true
		System.out.println(arr1.containsAll(arr6));	// false, arr6의 요소가 다 존재하는지 확인
		
		List arr7 = new ArrayList();
		arr7.add(5566);
		arr7.add(300);
		arr7.add(998877);	// 없는 요소는 삭제 안함, 오류 아님
		arr1.removeAll(arr7);
		System.out.println("removeall: "+arr1);
		arr1.retainAll(arr6);	// arr6에 있는 것만 남기고 다 삭제
		System.out.println("retainAll: "+arr1);
		
		System.out.println(arr1.isEmpty());	// 비어있는지 확인
		arr1.clear();
		System.out.println(arr1.isEmpty());	// 비어있는지 확인
		
		
		System.out.println("Collections");
		System.out.println("arr5: "+arr5);
		Collections.replaceAll(arr5, 100, "백");
		System.out.println("replaceAll: "+arr5);
		Collections.reverse(arr5);
		System.out.println("reverse: "+arr5);
		Collections.swap(arr5, 0, 2);	// 0번째와 2번째의 순서를 바꿈
		System.out.println("swap: "+arr5);
		Collections.shuffle(arr5);
		System.out.println("shuffle: "+arr5);
		
		arr6.add(500);
		arr6.add(100);
		arr6.add(300);
		arr6.add(400);
		arr6.add(800);
		arr6.add(200);
		System.out.println("arr6: "+arr6);
//		Collections.sort(arr5);	요소가 모두 비교 가능해야함
		Collections.sort(arr6);	
		System.out.println("sort: "+arr6);
		
		
		System.out.println("copy");
		List arr8 = arr6;								// shallow copy
		List arr9 = (List)((ArrayList)arr6).clone();	// deep copy
		List arr10 = new ArrayList(arr6);				// deep copy
		
		System.out.println(arr6==arr8);		// true
		System.out.println(arr6==arr9);		// false
		System.out.println(arr6==arr10);	// false
		
		System.out.println("arr6 : "+arr6);
		System.out.println("arr8 : "+arr8);
		System.out.println("arr9 : "+arr9);
		System.out.println("arr10: "+arr10);
		arr6.set(3, 3456);
		System.out.println("arr6 : "+arr6);
		System.out.println("arr8 : "+arr8);
		System.out.println("arr9 : "+arr9);
		System.out.println("arr10: "+arr10);
	}

}
