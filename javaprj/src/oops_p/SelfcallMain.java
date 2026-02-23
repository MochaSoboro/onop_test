package oops_p;

class SelfCall {
	
	String pre = "";	// 멤버변수, heap에 저장(공유 됨)
	
	int meth(int no) {	// 초기값
		String myPre = pre;	// 지역변수, stack에 저장(공유 안됨)
		pre+="\t";
		
		int res = no;
		
		System.out.println(myPre+"시작 "+no+":"+res);
		if (no > 0) {	// 조건			
			res += meth(no - 1);	// 재귀호출, 증감
		}
 		System.out.println(myPre+"끝 "+no+":"+res);
		return res;
	}
}

public class SelfcallMain {

	public static void main(String[] args) {
		int rr = new SelfCall().meth(3);
		System.out.println("rr :"+rr);
	}

}
