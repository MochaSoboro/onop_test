package array_p;

public class ExamMain {

	public static void main(String[] args) {
		String [] pname = {"손오공", "베지터", "크리링", "피콜로", "천진반", "무천도사", "부르마", "야무치"};
		
		int [][] jum = {
				{97, 99, 91},
				{87, 79, 91},
				{75, 96, 71, 72},
				{87, 69, 71, 93},
				{97, 89, 51},
				{88, 74, 92, 85},
				{89, 87, 83},
				{67, 69, 63}
		};
		
		// 전공, 총점, 평점, 등급
		// 일반 - 평균
		// 예능 - 0.05, 0.1, 0.15, 0.7
		
		// 2. 연산부
		String [][] res1 = new String[pname.length][2];	// 전공, 등급
		int [][] res2 = new int[pname.length][2];	// 총점, 평점
		String [] kind = {"일반", "예능"};
		double [] rate = {0.05, 0.1, 0.15, 0.7};
		String [] grade = {"가", "가", "가", "가", "가", "가", "양", "미", "우", "수", "수"};
		
		for (int i=0; i<pname.length; i++) {
			res1[i][0] = kind[jum[i].length-3];
			res2[i][0] = 0;
			res2[i][1] = 0;

			for (int j=0; j<jum[i].length; j++) {
				res2[i][0] += jum[i][j];
				res2[i][1] += jum[i][j] * rate[j];
			}
			if (res1[i][0] == "일반") {
				res2[i][1] = res2[i][0]/jum[i].length;
			}
			
			res1[i][1] = grade[res2[i][1]/10];
		}
		
		// 3. 출력부
		for (int i=0; i<pname.length; i++) {
			String ttt = res1[i][0]+"\t"+pname[i]+"\t";
			for (int j : jum[i]) {
				ttt+=j+"\t";
			}
			if (res1[i][0] == "일반") {
				ttt += "\t";
			}
			for (int j : res2[i]) {
				ttt += j+"\t";
			}
			
			ttt += res1[i][1];
			System.out.println(ttt);
		}
		
	}

}
