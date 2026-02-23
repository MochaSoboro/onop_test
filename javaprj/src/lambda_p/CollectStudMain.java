package lambda_p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
CollectStudMain
반별로 구분하세요
-- 학생정렬 기준: 나이
반  이름   나이  키
1,"장동건", 47,180
3,"현빈",  29,182
3,"정우성", 37,188
1,"원빈",  45,170
*/

class banMem {
	String name;
	int ban, age, height;
	
	banMem(int ban, String name, int age, int height) {
		this.ban = ban;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "["+name + ", ban=" + ban + ", age=" + age + ", height=" + height+"]";
	}
}

class orgAge implements Comparator<banMem> {

	@Override
	public int compare(banMem o1, banMem o2) {
		return o2.age - o1.age;		// 나이 내림차순
	}
	
}

public class CollectStudMain {
	public static void main(String[] args) {
		banMem [] stud = {
			new banMem(1,"장동건", 47,180),	
			new banMem(3,"현빈",  29,182),	
			new banMem(3,"정우성", 37,188),	
			new banMem(1,"원빈",  45,170),	
		};
		
		Map<Integer, TreeSet<banMem>> map = Arrays.stream(stud)
				.collect(Collectors.groupingBy(a -> a.ban, Collectors.toCollection(()-> new TreeSet(new orgAge()))));
		System.out.println(map);
	}
}
