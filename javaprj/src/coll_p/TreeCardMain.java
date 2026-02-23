package coll_p;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeCardMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		TreeSet hights = new TreeSet();
		TreeSet lowts = new TreeSet();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			ts.clear();
			while(ts.size() < 10) {
				ts.add((int)(Math.random()*50+1));
			}
			
			System.out.println(ts);
			
			System.out.print("범인 카드 : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			
			hights = (TreeSet)ts.tailSet(num);
			lowts = (TreeSet)ts.headSet(num);
			System.out.println("높은 카드: "+hights);
			System.out.println("낮은 카드: "+lowts.descendingSet());
		}
	}

}
