package array_p;

import java.util.Arrays;

public class ArrayCombineSortMain {

	public static void main(String[] args) {
		// 34, 7, 100, 9, 67, 10, 86
		// 13,56,49,67,82,23,45,8,17
		int [] arr1 = {34, 7, 100, 9, 67, 10, 86};
		int [] arr2 = {13, 56, 49, 67, 82, 23, 45, 8, 17};
		int [] arr3 = new int[arr1.length + arr2.length];
		
		// bubble sort
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1.length; j++) {		
				if (arr1[i] < arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		// bubble sort
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2.length; j++) {		
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int cnt = 0;
		
		int i = 0;
		int j = 0;
		
		
		// merge sort
		while(i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr3[cnt++] = arr1[i];
				i++;
			}
			else {
				arr3[cnt++] = arr2[j];
				j++;
			}
		}
		
		if (i < arr1.length) {
			for (int k = i; k < arr1.length; k++) {
				arr3[cnt++] = arr1[k];
			}
		}
		
		if (j < arr2.length) {
			for (int k = j; k < arr2.length; k++) {
				arr3[cnt++] = arr2[k];
			}
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
