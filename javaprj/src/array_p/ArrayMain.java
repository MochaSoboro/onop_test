package array_p;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		int a = 10;
		int [] arr1 = {11, 22, 33, 44};
		
		System.out.println("a : "+a);
		System.out.println("arr1 : "+arr1);	// [I@33c7353a
											// [ : 1차원 배열
											// I : int (자료형)
											// @ : 의미없음(구분자)
											// 33c7353a : 해시코드
		
		System.out.println("arr1[0] : "+arr1[0]);	// 11
		arr1[0] = 1234;
		System.out.println("arr1[0] : "+arr1[0]);	// 1234
		
		a = 20;
//		arr1 = {100, 200, 300, 400};
		int [] arr2 = new int[5];	// 초기값 0
					// new int[] {0, 0, 0, 0, 0};
		System.out.println("arr2 : "+arr2);	// [I@3af49f1c
		System.out.println("arr2[0] : "+arr2[0]);
		System.out.println("arr2[1] : "+arr2[1]);
		System.out.println("arr2[2] : "+arr2[2]);
		System.out.println("arr2[3] : "+arr2[3]);
		System.out.println("arr2[4] : "+arr2[4]);
//		System.out.println("arr2[5] : "+arr2[5]);
		// ArrayIndexOutOfBoundsException : Index 5 out of bounds for length 5
		
		int [] arr3 = new int[] {0, 0, 0, 0, 0};
		System.out.println("arr3 : "+arr3);	// [I@19469ea2
		System.out.println("arr3[0] : "+arr3[0]);
		System.out.println("arr3[1] : "+arr3[1]);
		System.out.println("arr3[2] : "+arr3[2]);
		System.out.println("arr3[3] : "+arr3[3]);
		System.out.println("arr3[4] : "+arr3[4]);
		
		int [] arr4 = {0, 0, 0, 0, 0};
					// new int[] {0, 0, 0, 0, 0};
		System.out.println("arr4 : "+arr3);
		System.out.println("arr4[0] : "+arr4[0]);
		System.out.println("arr4[1] : "+arr4[1]);
		System.out.println("arr4[2] : "+arr4[2]);
		System.out.println("arr4[3] : "+arr4[3]);
		System.out.println("arr4[4] : "+arr4[4]);
		
		// 동적할당하여 대입 가능
		// new int[]는 배열 초기화 시에만 생략 가능
		arr1 = new int[] {123, 456, 789};
		
		// 배열 원소 내용 확인
		System.out.println(Arrays.toString(arr1));	// [123, 456, 789]
		System.out.println(Arrays.toString(arr2));	// [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(arr3));	// [0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(arr4));	// [0, 0, 0, 0, 0]
		
		// 배열 길이 확인
		System.out.println(arr1.length);	// 3
		System.out.println(arr2.length);	// 5
		System.out.println(arr3.length);	// 5
		System.out.println(arr4.length);	// 5
		
		int [] arr5 = {12, 34, 565, 78};
		int [] arr6 = {12, 34, 565, 78};
		int [] arr7 = new int[]{12, 34, 565, 78};
		int [] arr8 = arr5;				// 얕은 복사 (shallow copy)
		int [] arr9 = arr5.clone();		// 깊은 복사 (deep copy)
		int [] arr10 = {arr5[0], arr5[1], arr5[2], arr5[3]};	// 깊은 복사 (deep copy)
		
		System.out.println("arr5 : "+arr5+" : "+Arrays.toString(arr5)+" : "+arr5.length);
		// arr5 : [I@13221655 : [12, 34, 565, 78] : 4
		System.out.println("arr6 : "+arr6+" : "+Arrays.toString(arr6)+" : "+arr6.length);
		// arr6 : [I@682a0b20 : [12, 34, 565, 78] : 4
		System.out.println("arr7 : "+arr7+" : "+Arrays.toString(arr7)+" : "+arr7.length);
		// arr7 : [I@3d075dc0 : [12, 34, 565, 78] : 4
		System.out.println("arr8 : "+arr8+" : "+Arrays.toString(arr8)+" : "+arr8.length);
		// 주소를 복사함
		// arr8 : [I@13221655 : [12, 34, 565, 78] : 4
		System.out.println("arr9 : "+arr9+" : "+Arrays.toString(arr9)+" : "+arr9.length);
		// arr9 : [I@214c265e : [12, 34, 565, 78] : 4
		System.out.println("arr10 : "+arr10+" : "+Arrays.toString(arr10)+" : "+arr10.length);
		// arr10 : [I@448139f0 : [12, 34, 565, 78] : 4
		
		// arr9와 arr10은 방식이 동일함
		
		System.out.println("arr5 == arr6 : "+(arr5 == arr6));	// false
		System.out.println("arr5 == arr7 : "+(arr5 == arr7));	// false
		System.out.println("arr5 == arr8 : "+(arr5 == arr8));	// true
		System.out.println("arr5 == arr9 : "+(arr5 == arr9));	// false
		System.out.println("arr5 == arr10 : "+(arr5 == arr10));	// false
		
		arr5[1] = 369;
		System.out.println("arr5 : "+arr5+" : "+Arrays.toString(arr5)+" : "+arr5.length);
		// arr5 : [I@13221655 : [12, 369, 565, 78] : 4
		System.out.println("arr6 : "+arr6+" : "+Arrays.toString(arr6)+" : "+arr6.length);
		// arr6 : [I@682a0b20 : [12, 34, 565, 78] : 4
		System.out.println("arr7 : "+arr7+" : "+Arrays.toString(arr7)+" : "+arr7.length);
		// arr7 : [I@3d075dc0 : [12, 34, 565, 78] : 4
		System.out.println("arr8 : "+arr8+" : "+Arrays.toString(arr8)+" : "+arr8.length);
		// 주소를 복사함
		// arr8 : [I@13221655 : [12, 369, 565, 78] : 4
		System.out.println("arr9 : "+arr9+" : "+Arrays.toString(arr9)+" : "+arr9.length);
		// arr9 : [I@214c265e : [12, 34, 565, 78] : 4
		System.out.println("arr10 : "+arr10+" : "+Arrays.toString(arr10)+" : "+arr10.length);
		// arr10 : [I@448139f0 : [12, 34, 565, 78] : 4

	}

}
