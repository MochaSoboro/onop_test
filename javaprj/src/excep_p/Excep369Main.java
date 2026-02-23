package excep_p;

// if문, 3항연산자, switch 등 조건항을 사용하지 않고 3, 6, 9게임 만들기
// 1~20 일의 자리만 체크

public class Excep369Main {

	public static void main(String[] args) {
		
		int no = 2784;
		
		for (int i=1; i<=no; i++) {
			int one = i%10;
			int ten = i/10;
			String ttt = "";
			int cnt = 0;
			
			try {
				int a = 1/(one%3);
			} catch (Exception e) {
				try {
					int a = 1/one;
					ttt += "짝";
					cnt++;
				} catch (Exception e2) {
				}
			}
			
//			try {
//				int a = 1/(ten%3);
//			} catch (Exception e) {
//				try {
//					int a = 1/ten;
//					ttt += "짝";
//					cnt++;
//				} catch (Exception e2) {
//				}
//			}
			
			try {
				int a = 1/(cnt%3);
			} catch (Exception e) {
				try {
					int a = 1/cnt;
					cnt++;
				} catch (Exception e2) {
					ttt+=i;
				}
			}
			
			System.out.println(ttt);
			
		}
	}

}
