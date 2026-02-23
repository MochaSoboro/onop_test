package coll_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		
//		map1.add(100);
//		map1.add("아기상어", 100);
		
		map1.put("고래", "포유류");
		map1.put("상어", "어류");
		map1.put("오타니", "이도류");
		map1.put("상어", "뚜루루뚜루");
		map1.put("사자", "포유류");
		map1.put(100, 123.456);
		System.out.println(map1);	// {100=123.456, 상어=뚜루루뚜루, 사자=포유류, 고래=포유류, 오타니=이도류}
		
		System.out.println(map1.keySet());	// [100, 상어, 사자, 고래, 오타니
		System.out.println(map1.values());	// [123.456, 뚜루루뚜루, 포유류, 포유류, 이도류]
		
		System.out.println(map1.get("상어"));	// 뚜루루뚜루
		Object oo = map1.remove("오타니");
		System.out.println(oo);		// 이도류
		System.out.println(map1);	// {100=123.456, 상어=뚜루루뚜루, 사자=포유류, 고래=포유류}
		System.out.println(map1.size());
		System.out.println(map1.containsKey(100));	// true
		System.out.println(map1.containsKey(200));	// false
		System.out.println(map1.containsValue("포유류"));	// true
		
		HashMap map2 = new HashMap();
		map2.put("라면", "분식");
		map2.put("자장면", "중식");
		map2.put("냉면", "한식");
		map2.put("개기", "일식");
		
		map1.putAll(map2);
		System.out.println(map1);
		
		HashMap map3 = map1;
		HashMap map4 = new HashMap(map1);
		HashMap map5 = (HashMap)map1.clone();
		
		map1.put("americano", 2800);
		System.out.println("---------------");
		System.out.println(map1);
		System.out.println(map3);
		System.out.println(map4);
		System.out.println(map5);
		
//		for (Object obj : map1) {}
		
		Set ss = map1.entrySet();
		// ss = [Map.Entry, Map.Entry, ....]로 구성이 되어 있다, key와 value를 묶어놓은 형태
		System.out.println(ss);	// [개기=일식, 100=123.456, 자장면=중식, 상어=뚜루루뚜루, 사자=포유류, 고래=포유류, 냉면=한식, americano=2800, 라면=분식]
		
		for (Object obj : ss) {
//			System.out.println(obj);
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		System.out.println("---------------");
		// key만 추출
		ss = map1.keySet();
		for (Object obj : ss) {
			System.out.println(obj+": "+map1.get(obj));
		}
		System.out.println("---------------");
		// value만 추출
		Collection vv = map1.values();
		for (Object obj : vv) {
			System.out.println(obj);
		}
		
		System.out.println("---------------");
		Iterator iterator = map1.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println(me.getKey()+" : "+me.getValue());
			if(me.getKey().equals("자장면")) {
				iterator.remove();
			}
			if(me.getValue().equals("포유류")) {
				iterator.remove();
			}
		}
		System.out.println(map1);
		System.out.println("---------------");
		System.out.println(map1.isEmpty());
		map1.clear();
		System.out.println(map1);
		System.out.println(map1.isEmpty());
		
		
	}

}
