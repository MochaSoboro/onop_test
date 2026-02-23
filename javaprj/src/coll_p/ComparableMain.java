package coll_p;

import java.util.TreeSet;

class ComData2 implements Comparable {
	String name;
	int age;
	boolean marriage;
	
	ComData2(String name, int age, boolean marriage) {
		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return age + "\t" + marriage + "\t" + name;
	}
	
	@Override
	public int compareTo(Object o) {
		ComData2 you = (ComData2)o;
		int res = age - you.age;
		if (res == 0) {
			if (marriage == you.marriage) {
				res = 0;
			}
			else if (marriage) {
				res = -1;
			}
			else {
				res = 1;
			}
		}
		
		if (res == 0) {
			res = name.compareTo(you.name);
		}
		
		return res;
	}
}

public class ComparableMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new ComData2("이문세", 64, true));
		ts.add(new ComData2("변진섭", 58, true));
		ts.add(new ComData2("김건모", 57, false));
		ts.add(new ComData2("김광석", 57, true));
		ts.add(new ComData2("신승훈", 58, true));
		
		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

}
