package lambda_p;

/*
Lambda3Main
정수3개를 매개변수로 받고 정수1개를 리턴하는 람다식 가능한 인터페이스를 구현하세요

계산식은 3개를 구현하세요
1. 3개의 합 리턴
2. 3개중 가장 큰수를 리턴
3. 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
* */

interface Lamb {
	int mmm(int a, int b, int c);
}


class Lambda3 {
	void meth(Lamb ll) {
		System.out.println(ll.mmm(10, 20, 30));
	}
}

public class Lambda3Main {

	public static void main(String[] args) {
		Lambda3 l3 = new Lambda3();
		
		l3.meth((a, b, c)->a+b+c);
		l3.meth((a, b, c)->{
			int big = a > b ? a : b;
			big = big > c ? big : c;
			return big;
		});
		l3.meth((a, b, c)->a*b-c);
	}

}
