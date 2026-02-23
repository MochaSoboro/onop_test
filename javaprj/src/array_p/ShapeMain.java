package array_p;

import java.lang.Math;
import java.util.Arrays;

public class ShapeMain {

	public static void main(String[] args) {
		// 도형의 넓이와 둘레 출력
		// 도형명 : 원, 직사각형, 직각삼각형
		// 선분 : 반지름, 가로/세로, 밑변/높이/빗변
		// 넓이 : pi*r**2, 가로*세로, 밑변*높이/2
		// 둘레 : 2*pi*r, (가로+세로)*2, 밑변+높이+빗변
		
		int [][] len = {
				{5},
				{5, 6},
				{5, 6, 8},
				{10, 4},
				{8},
				{10, 6, 13}
		};
		
		String [] name = {"", "원", "직사각형", "직삼각형"};
		double [][] res = new double[len.length][2];	// 넓이, 둘레
		
		double pi = Math.PI;
		
		// 연산
		for (int i=0; i<len.length; i++) {
			if (len[i].length == 1) {
				res[i][0] = (double)(int)(pi*Math.pow(len[i][0], 2)*100+0.5)/100;
				res[i][1] = (double)(int)(2*pi*len[i][0]*100+0.5)/100;
			}
			else if (len[i].length == 2) {
				res[i][0] = len[i][0] * len[i][1];
				res[i][1] = 2*(len[i][0] + len[i][1]);
			}
			else {
				res[i][0] = len[i][0] * len[i][1];
				res[i][1] = len[i][0] + len[i][1] + len[i][2];
			}
		}
		
		// 출력
		for (int i=0; i<len.length; i++) {
			String shape = name[len[i].length]+"\t";
			shape += Arrays.toString(len[i])+"\t";
			if (len[i].length != 3) {
				shape += "\t";
			}
			shape += Arrays.toString(res[i]);
			System.out.println(shape);
		}
	}

}
