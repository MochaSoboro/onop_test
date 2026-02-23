package coll_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class ComData {
	String name;
	int age;
	
	ComData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ComData [name=" + name + ", age=" + age + "]";
	}
}

class ComDataCom implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		ComData me = (ComData)o1;
		ComData you = (ComData)o2;
		
		// 나이 오름차순
		int res = me.age - you.age;
		if (res == 0) {
			// 나이가 같다면 이름 오름차순
			res = me.name.compareTo(you.name);
		}
		
		return res;
	}
}

public class ComParatorMain2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet(new ComDataCom());
		
		hs.add(new ComData("나훈아", 68));
		hs.add(new ComData("김연자", 58));
		
		ts.add(new ComData("김연자", 58));
		ts.add(new ComData("이미자", 78));
		ts.add(new ComData("송대환", 68));
		ts.add(new ComData("설운도", 65));
		ts.add(new ComData("태진아", 62));
		ts.add(new ComData("나훈아", 68));
		ts.add(new ComData("남진", 58));
		
		System.out.println("hs "+hs);
//		System.out.println("ts "+ts);
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

}
