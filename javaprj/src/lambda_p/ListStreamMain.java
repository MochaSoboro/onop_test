package lambda_p;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListStreamMain {
	static int sum = 0;

	public static void main(String[] args) throws Exception {
		List<String> arr = new ArrayList<String>();
		arr.add("바쿠야");
		arr.add("사도");
		arr.add("켄파치");
		arr.add("이치고");
		arr.add("키스케");
		
		System.out.println("List: "+arr);
		
		Stream<String> str = arr.stream();
		System.out.println(str);
		str.forEach(a -> System.out.println(a));
		str.close();
		
		String [] arr2 = "루피,조로,나미,상디,샹크스,로빈".split(",");
		System.out.println("배열: "+arr2);
//		arr2.stream();
		Stream<String> str2 = Arrays.stream(arr2);
		str2.forEach(a -> System.out.println(a));
		str2.close();
		
		System.out.println("숫자범위: range(1, 5)");	// 1~4
		IntStream istr = IntStream.range(1, 5);
		istr.forEach(a -> System.out.println(a));
		
		System.out.println("숫자범위: rangeClosed(1, 5)");	// 1~5
		istr = IntStream.rangeClosed(1, 5);
		istr.forEach(a -> System.out.println(a));
		
		System.out.println("파일: Files.lines()");	// 1~5
		Stream<String> str3 = Files.lines(new File("fff/exam.txt").toPath());
		str3.forEach(a -> System.out.println(a));
		str3.close();
		
		// 1 ~ 100 합 구하기
		IntStream numSum = IntStream.rangeClosed(1, 100);
		numSum.forEach(num -> sum += num);
		System.out.println(sum);
	}
}
