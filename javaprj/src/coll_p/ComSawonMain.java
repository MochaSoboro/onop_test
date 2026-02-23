package coll_p;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.regex.Pattern;

/*
ComSawonMain
직급, 이름순으로 정렬해 주세요 

직급 : 사장 > 부장 > 과장 > 대리 > 사원

이름 : 오름차순


사원_정우성,
과장_현빈,
부장_원빈,
과장_장동건,
사원_장서건,
대리_정남성,
대리_정좌성,
부장_이효리,
사원_삼효리,
과장_한가인,
대리_두가인"
 * */

class SawonComData {
	enum Position {
		사장, 부장, 과장, 대리, 사원
	}
	String name;
	Position pos;

	SawonComData(String data) {
		pos = Position.valueOf(data.split("_")[0]);
		name = data.split("_")[1];
	}

	@Override
	public String toString() {
		return "[직급: " + pos + ", 이름: " + name + "]";
	}
	
}

class ComSawon implements Comparator {
	String [] position = {"사장", "부장", "과장", "대리", "사원"};
	
	@Override
	public int compare(Object o1, Object o2) {
		SawonComData me = (SawonComData)o1;
		SawonComData you = (SawonComData)o2;
		
//		int mep = 0;
//		int youp = 0;
//		for (int i=0; i<position.length; i++) {
//			if (Pattern.matches(me.position, position[i])) {
//				mep = i;
//			}
//			if (Pattern.matches(you.position, position[i])) {
//				youp = i;
//			}
//		}
		
		// enum의 ordinal()을 이용하여 순서 비교 가능

		// 직급 내림차순
		// me:높은 직급(낮은 숫자) - you:낮은 직급(높은 숫자) = 음수
		// 양수면 me를 you 뒤쪽에 배치 (you, me)
		// 음수면 me를 you 앞쪽에 배치 (me, you)
		int res = me.pos.ordinal() - you.pos.ordinal();
		if (res == 0) {
			// 이름 오름차순
			res = me.name.compareTo(you.name);	// (me.name) - (you.name)
		}
		
		return res;
	}
}

public class ComSawonMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComSawon());
		
		
		ts.add(new SawonComData("사원_정우성"));
		ts.add(new SawonComData("과장_현빈"));
		ts.add(new SawonComData("부장_원빈"));
		ts.add(new SawonComData("과장_장동건"));
		ts.add(new SawonComData("사원_장서건"));
		ts.add(new SawonComData("대리_정남성"));
		ts.add(new SawonComData("대리_정좌성"));
		ts.add(new SawonComData("부장_이효리"));
		ts.add(new SawonComData("사원_삼효리"));
		ts.add(new SawonComData("과장_한가인"));
		ts.add(new SawonComData("대리_두가인"));
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
		System.out.println("A".compareTo("B"));	// "A" - "B" = 음수 -> 음수면 "A"를 "B" 앞쪽에 배치
	}

}
