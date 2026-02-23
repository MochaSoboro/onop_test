package control_p;

import java.util.Scanner;

public class ScanneerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
//		int no = sc.nextInt();
//		System.out.println(no + 100);
		
//		String str = sc.next();	// 엔터와 띄어쓰기로 버퍼 구분
//		System.out.println("str1: "+str);
//		str = sc.next();
//		System.out.println("str2: "+str);
//		str = sc.next();
//		System.out.println("str3: "+str);
//		str = sc.next();
//		System.out.println("str4: "+str);
//		str = sc.next();
//		System.out.println("str5: "+str);
		
//		String str = sc.nextLine();	// 엔터로 버퍼 구분
//		System.out.println(str);
		
//		float ff = sc.nextFloat();
//		double dd = sc.nextDouble();
//		byte bb = sc.nextByte();
//		short sh = sc.nextShort();
//		long lo = sc.nextLong();
//		boolean bo = sc.nextBoolean();
		
		String str = sc.nextLine();	// 엔터로 버퍼 구분
		System.out.println(str);
//		int no = sc.nextInt();
//		System.out.println(no);
		str = sc.nextLine();
		System.out.println(str);
		int no = sc.nextInt();
		System.out.println(no);
		System.out.println("종료");
		
		sc.close();
	}

}
