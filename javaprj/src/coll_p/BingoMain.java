package coll_p;

/*
BingoMain
빙고를 구현해 주세요

숫자 범위 : 1-> 100

출력모양 : 5 x 5

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *


 */

import java.util.HashSet;

public class BingoMain {

	public static void main(String[] args) {
		HashSet bingo = new HashSet();
		
		while(true) {
			int no = (int)(Math.random()*100+1);
			bingo.add(no);
			
			if (bingo.size() == 25) {
				break;
			}
		}
		
		int no = 0;
		for (Object obj : bingo) {
			no++;
			System.out.print(obj+"\t");
			if (no%5 == 0) {
				System.out.println();
			}
		}
	}

}
