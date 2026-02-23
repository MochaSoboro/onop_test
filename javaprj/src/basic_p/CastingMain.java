package basic_p;

public class CastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("upcasting");
		byte bb = 123;
		int a = bb;		// 자동 형변환 (upcasting), 묵시적 형변환
		long lo = a;
		
		System.out.println(bb);	// 123
		System.out.println(a);	// 123
		System.out.println(lo);	// 123
		lo = 9223372036854775807L;
		System.out.println(lo);	// 9223372036854775807L
		
		float ff = bb;
		System.out.println(ff);	// 123.0
		ff = a;
		System.out.println(ff);	// 123.0
		ff = lo;
		System.out.println(ff);	// 9.223372E18, 지수 표현으로 바뀜
		
		char ch = 'c';
		System.out.println(ch);	// c
		a = ch;
		System.out.println(a);	// 99, ASCII
		
		System.out.println("downcasting");
		// 강제 형변환 (downcasting), 명시적 형변환
		a = 100;
//		bb = a;
		bb = (byte)a;
		System.out.println(bb);	// 100
		
		a = 130;
		bb = (byte)a;
		System.out.println(bb);	// -126
		
		double dd = 123.456;
		a = (int)dd;
		System.out.println(dd);	// 123.456
		System.out.println(a);	// 123
		
		a = 100;
		ch = (char)a;
		System.out.println(ch);	// d
		
		boolean bo = true;
//		a = (int)bo;	boolean 형변환 불가
		a = 1;
//		bo = (boolean)a;

	}

}
