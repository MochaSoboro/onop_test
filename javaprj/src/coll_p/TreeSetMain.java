package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		int [] ori = {33, 66, 44, 77, 11, 33, 44, 66, 77, 22, 11, 44};
		ArrayList arr = new ArrayList();			// 중복 O, 입력순서
		HashSet hs = new HashSet();					// 중복 X, 순서 X
		LinkedHashSet lhs = new LinkedHashSet();	// 중복 X, 입력순서
		TreeSet ts = new TreeSet();					// 중복 X, 오름차순 정렬
		
		for (int i : ori) {
			arr.add(i);
			hs.add(i);
			lhs.add(i);
			ts.add(i);
		}
		
		arr.add("아기상어");
		hs.add("아기상어");
		lhs.add("아기상어");
//		ts.add("아기상어");	모든 원소가 비교 가능해야함
		
		System.out.println("arr:\t"+arr);
		// [33, 66, 44, 77, 11, 33, 44, 66, 77, 22, 11, 44]
		System.out.println("hs:\t"+hs);
		// [33, 66, 22, 11, 44, 77]
		System.out.println("lhs:\t"+lhs);
		// [33, 66, 44, 77, 11, 22]
		System.out.println("ts:\t"+ts);
		// [11, 22, 33, 44, 66, 77]
		
		System.out.println("[LinkedHashSet]");
//		lhs.get(0);
		System.out.println("getFirst: "+lhs.getFirst());	// jdk 21 이상만 가능 (안 쓰는 걸 권유)
		System.out.println("getLast: "+lhs.getLast());		// jdk 21 이상만 가능 (안 쓰는 걸 권유)
		
		System.out.println("[TreeSet]");
		System.out.println("first: "+ts.first());	// 맨앞
		System.out.println("last: "+ts.last());		// 맨뒤
		System.out.println("lower(35) "+ts.lower(35));	// 35보다 앞의 객체 하나
		System.out.println("lower(33) "+ts.lower(33));	// 같은 값은 포함하지 않음
		System.out.println("higher(35) "+ts.higher(35));	// 35보다 뒤의 객체 하나
		System.out.println("higher(33) "+ts.higher(33));	// 같은 값은 포함하지 않음
		System.out.println("floor(35) "+ts.floor(35));	// 35보다 앞의 객체 하나
		System.out.println("floor(33) "+ts.floor(33));	// 같은 값은 포함
		System.out.println("ceiling(35) "+ts.ceiling(35));	// 35보다 뒤의 객체 하나
		System.out.println("ceiling(35) "+ts.ceiling(33));	// 같은 값은 포함
		System.out.println("ts: "+ts);				// [11, 22, 33, 44, 66, 77]
		Object rr = ts.pollFirst();	// 맨앞 객체를 꺼내서 가져옴
		System.out.println("ts.pollFirst: "+rr);	// 11
		System.out.println("ts: "+ts);				// [22, 33, 44, 66, 77]
		rr = ts.pollLast();
		System.out.println("ts.pollLast: "+rr);		// 77
		System.out.println("ts: "+ts);				// [22, 33, 44, 66]
		
		TreeSet tsH1 = (TreeSet)ts.headSet(44);
		System.out.println("headSet(44)\t\t"+tsH1);	// 검색객체 앞 요소로 SortedSet 리턴, 자신 포함 안함
		
		TreeSet tsH2 = (TreeSet)ts.headSet(44, true);
		System.out.println("headSet(44, true)\t"+tsH2);	// 검색객체 앞 요소로 SortedSet 리턴, 자신 포함
		
		TreeSet tsH3 = (TreeSet)ts.tailSet(33);
		System.out.println("tailSet(33)\t\t"+tsH3);	// 검색객체 앞 요소로 SortedSet 리턴, 자신 포함
		
		TreeSet tsH4 = (TreeSet)ts.tailSet(33, true);
		System.out.println("tailSet(33, true)\t"+tsH4);	// 검색객체 앞 요소로 SortedSet 리턴, 자신 포함
		
		TreeSet tsDESC = (TreeSet)ts.descendingSet();	// 역정렬 NavigableSet 리턴
		System.out.println("descendingSet\t"+tsDESC);
		
		System.out.println("Iterator-------------");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Iterator DESC-------------");
		Iterator itDESC = ts.descendingIterator();
		while(itDESC.hasNext()) {
			System.out.println(itDESC.next());
		}
		
		
		
	}

}
