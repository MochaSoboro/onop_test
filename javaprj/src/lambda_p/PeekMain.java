package lambda_p;

import java.util.Arrays;

public class PeekMain {

	public static void main(String[] args) {
		int [] arr = {11, 22, 33, 44, 55, 66, 77, 88};
		
		System.out.println("peek 종단 -----------------------");
		Arrays.stream(arr)
		.filter(a -> a%2 == 0)
		.peek(System.out::println);	// 마지막에 있을 경우 실행 안함
		
		System.out.println("forEach 종단 -----------------------");
		
		Arrays.stream(arr)
		.filter(a -> a%2 == 0)
		.forEach(System.out::println);	// 실행 함
		
		System.out.println("peek 중간 -----------------------");
		
		int tot = Arrays.stream(arr)
		.filter(a -> a%2 == 0)
		.peek(System.out::println)	// 중간에 있을 경우 실행 함
		.sum();
		System.out.println("tot "+tot);
		
		System.out.println("forEach 중간 -----------------------");
		
		Arrays.stream(arr)
		.filter(a -> a%2 == 0)
//		.forEach(System.out::println)	중간에 있을 경우 에러 발생
		.sum();
		
	}

}
