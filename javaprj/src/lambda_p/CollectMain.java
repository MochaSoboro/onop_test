package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectMain {
	public static void main(String[] args) {
		int [] arr1 = {33, 44, 11, 77, 22, 33, 55, 11, 88, 22};
		
		// java 16 이전
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		System.out.println("Collectors.toList: "+list1);
		
		// java 16 이후
		// boxed : XXXStream -> Stream<XXX> 형태로 변환, 전용 스트림을 범용 객체 스트림으로 변환
		list1 = Arrays.stream(arr1).boxed().toList();
		System.out.println("toList: "+list1);
		
		// HashSet
		Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		System.out.println("Collectors.toSet: "+set1);
		
		Set<Integer> set2 = Arrays.stream(arr1).boxed().collect(Collectors.toCollection(()-> new LinkedHashSet<Integer>()));
		// .collect(Collectors.toCollection(LinkedHashSet<Integer>::new))
		System.out.println("Collectors.LinkedHashSet: "+set2);
		
		// TreeSet - 오름차순
		set2 = Arrays.stream(arr1).boxed().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Collectors.TreeSet: "+set2);
		
		// TreeSet - 내림차순
		set2 = Arrays.stream(arr1).boxed().collect(Collectors.toCollection(()-> new TreeSet(Comparator.reverseOrder())));
		System.out.println("TreeSet(Comparator.reverseOrder()): "+set2);
		
		// Map - 짝수 홀수
		Map<String, List<Integer>> map1 = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(a -> a%2 == 0 ? "짝수" : "홀수"));
		System.out.println("groupingBy: "+map1);
		
		// Map - 짝수Set 홀수Set
		Map<String, Set<Integer>> map2 = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(a -> a%2 == 0 ? "짝수" : "홀수",
				Collectors.toSet()));
		System.out.println("groupingBy: "+map2);
	}
}
