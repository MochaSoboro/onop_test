package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		Object [] data = {33, 11, 'a', 55, 97, 33, 55, 11, 33, "11", "ONOP", "ONOP"};
		ArrayList arr1 = new ArrayList();	// 중복 허용, 순서 존재
		HashSet ss1 = new HashSet();	// 중복 비허용, 순서 비존재
		
		for (Object dd : data) {
			arr1.add(dd);
			ss1.add(dd);
		}
		
		System.out.println(Arrays.toString(data));
		System.out.println(arr1);
		System.out.println(ss1);
//		System.out.println(ss1.get(0));
//		ss1.set(5, 100);
		
		System.out.println("ss1 향상된 for문------------------");
		for (Object oo : ss1) {
			System.out.println(oo);
		}
		System.out.println("ss1 Iterator------------------");
		Iterator it = ss1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		HashSet ss2 = new HashSet(data);
		HashSet ss3 = new HashSet(arr1);
		HashSet ss4 = new HashSet(ss1);
		HashSet ss5 = ss1;
		HashSet ss6 = (HashSet)ss1.clone();
		HashSet ss7 = new HashSet();
		HashSet ss8 = new HashSet();
		ss7.addAll(arr1);
		ss8.addAll(ss1);
		
		System.out.println("ss3: "+ss3);
		System.out.println("ss4: "+ss4);
		System.out.println("ss5: "+ss5);
		System.out.println("ss6: "+ss6);
		System.out.println("ss7: "+ss7);
		System.out.println("ss8: "+ss8);
		System.out.println("ss1==ss3: "+(ss1==ss3));	// false
		System.out.println("ss1==ss4: "+(ss1==ss4));	// false
		System.out.println("ss1==ss5: "+(ss1==ss5));	// true
		System.out.println("ss1==ss6: "+(ss1==ss6));	// false
		System.out.println("ss1==ss7: "+(ss1==ss7));	// false
		System.out.println("ss1==ss8: "+(ss1==ss8));	// false
		
		System.out.println("ss1.equals(ss3): "+ss1.equals(ss3));	// true
		System.out.println("ss1.equals(ss4): "+ss1.equals(ss4));	// true
		System.out.println("ss1.equals(ss5): "+ss1.equals(ss5));	// true
		System.out.println("ss1.equals(ss6): "+ss1.equals(ss6));	// true
		System.out.println("ss1.equals(ss7): "+ss1.equals(ss7));	// true
		System.out.println("ss1.equals(ss8): "+ss1.equals(ss8));	// true
		
		ArrayList arr2 = new ArrayList(ss1);
		ArrayList arr3 = new ArrayList();
		arr3.addAll(ss1);
		
		System.out.println("arr2: "+arr2);
		System.out.println("arr3: "+arr3);
		
		System.out.println("삭제 remove");
		ss1.remove(11);	// index가 없기 때문에 숫자 11을 삭제
		System.out.println(ss1);
		ss1.remove("ONOP");	
		System.out.println(ss1);
		
		Object [] data2 = {33, 44, 55, 66, "아기상어"};
		ArrayList arr4 = new ArrayList();
		for (Object object : data2) {
			arr4.add(object);
		}
		System.out.println("arr4: "+arr4);
		ss1.removeAll(arr4);
		System.out.println("ss1.removeAll(arr4): "+ss1);	// ss1과 arr4의 교집합이 삭제됨
		System.out.println("ss3: "+ss3);
		ss3.retainAll(arr4);
		System.out.println("ss3.retainAll(arr4): "+ss3);	// 교집합만 남김
		System.out.println(ss3.isEmpty());	// false
		ss3.clear();
		System.out.println("ss3.clear(): "+ss3);
		System.out.println(ss3.isEmpty());
		
		System.out.println("로또 번호");
		ArrayList lotto1 = new ArrayList();
		HashSet lotto2 = new HashSet();
		
		while(true) {
			int no = (int)(Math.random()*45+1);
			lotto1.add(no);
			lotto2.add(no);
			
			if (lotto2.size() == 7) {
				break;
			}
		}
		
		System.out.println("lotto1 "+lotto1);	// 중복이 허용됨
		System.out.println("lotto2 "+lotto2);
		
	}

}
