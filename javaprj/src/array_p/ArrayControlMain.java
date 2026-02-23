package array_p;

import java.util.Arrays;

public class ArrayControlMain {

	public static void main(String[] args) {
		
		int [] arr1 = {11, 22, 33, 44};
		int arr2[] = {55, 66, 77, 88};
		
		System.out.println("arr1 : "+arr1+" : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+arr2+" : "+Arrays.toString(arr2));
		
		// 배열에 원소 추가하기 (안됨)
//		arr1[4] = 1234;	-> ArrayIndexOutOfBoundsException
		
		int [] arr3 = new int[arr1.length+1];
		System.out.println("arr3 : "+arr3+" : "+Arrays.toString(arr3));
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			arr3[i] = arr1[i];
		}
		arr3[arr1.length] = 55;
		System.out.println("arr3 : "+arr3+" : "+Arrays.toString(arr3));
		arr1 = arr3;		
		System.out.println("arr1 : "+arr1+" : "+Arrays.toString(arr1));
		// arr1은 가비지 컬렉션이 처리
		
		
		// 67, 89, 23, 46, 57, 83, 52, 91, 73 -> 짝수로 구성된 배열을 구현

		int [] num = {67, 89, 23, 46, 12, 57, 83, 52, 91, 73};
		int cnt = 0;
		for (int i=0; i<num.length; i++) {
			if (num[i] % 2 == 0) {
				cnt++;
			}
		}
		
		int [] even = new int[cnt];
		cnt = 0;
		for (int i=0; i<num.length; i++) {
			if (num[i] % 2 == 0) {
				even[cnt++] = num[i];
			}
		}
		
		System.out.println("even : "+even+" : "+Arrays.toString(even));
		
	}

}
