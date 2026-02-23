package coll_p;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
MapNumMain
2,3,5,7 배수의 갯수를 구하세요
22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57

다음 숫자들의 각 약수들의 갯수를 구하세요 단 0,1 제외
 * */

public class MapNumMain {

	public static void main(String[] args) {
		int [] numArr = {22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57};
		
		System.out.println("2, 3, 5, 7 배수의 개수");
		HashMap multipleNum = new HashMap();
		
		multipleNum.put(2, 0);
		multipleNum.put(3, 0);
		multipleNum.put(5, 0);
		multipleNum.put(7, 0);
		
		Set ms = multipleNum.entrySet();
		
		for (int num : numArr) {
			for (Object obj : ms) {
				Map.Entry me = (Map.Entry)obj;
				if (num%(int)me.getKey() == 0) {
					multipleNum.put(me.getKey(), (int)(me.getValue())+1);
				}
			}
		}
		
		for (Object obj : ms) {
			Map.Entry me = (Map.Entry)obj;
//			System.out.println(me.getKey()+" : "+me.getValue());
			System.out.println(me);
		}
		
		System.out.println("각 숫자들의 약수 개수");
		HashMap divisorNum = new HashMap();
		
		Set ss = divisorNum.entrySet();
		for (int num : numArr) {
			for (int i=2; i<num; i++) {
				if (num%i == 0) {
					if (!divisorNum.containsKey(i)) {
						divisorNum.put(i, 1);
					}
					else {
						divisorNum.put(i, (int)(divisorNum.get(i))+1);
					}
				}
			}
		}
		
		
		for (Object obj : ss) {
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
	}

}
