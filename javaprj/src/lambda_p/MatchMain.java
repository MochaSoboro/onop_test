package lambda_p;

import java.util.Arrays;

public class MatchMain {

	public static void main(String[] args) {
		int [] arr = {2, 4, 6, 8, 10};
		
		System.out.println("All 2의 배수: "+Arrays.stream(arr).allMatch(a -> a%2 == 0));	// true
		System.out.println("All 3의 배수: "+Arrays.stream(arr).allMatch(a -> a%3 == 0));	// false
		System.out.println("Any 3의 배수: "+Arrays.stream(arr).anyMatch(a -> a%3 == 0));	// true
		System.out.println("Any 7의 배수: "+Arrays.stream(arr).anyMatch(a -> a%7 == 0));	// false
		System.out.println("None 3의 배수: "+Arrays.stream(arr).noneMatch(a -> a%3 == 0));	// false
	}

}
