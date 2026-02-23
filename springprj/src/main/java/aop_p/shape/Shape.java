package aop_p.shape;

import org.springframework.stereotype.Component;

@Component
public class Shape {
	public int[] calcLine(int r) {
		String name = "";
		int area, border;
		
		name = "원";
		area = (int)(Math.PI * Math.pow(r, 2));
		border = (int)(2 * Math.PI * r);
		System.out.println(area+", "+border);
		
		return new int[] {area, border};
	}
//	public String calcLine(int r) {
//		String name = "";
//		int area, border;
//		
//		name = "원";
//		area = (int)(Math.PI * Math.pow(r, 2));
//		border = (int)(2 * Math.PI * r);
//		System.out.println(area+", "+border);
//		
//		return name;
//	}
	public int[] calcLine(int w, int h) {
		String name = "";
		int area, border;
		
		name = "직사각형";
		area = w * h;
		border = 2 * (w + h);
		System.out.println(area+", "+border);
		
		return new int[] {area, border};
	}
	
	public int[] calcLine(int w, int h, int b) {
		String name = "";
		int area, border;
		
		name = "직각삼각형";
		area = w * h / 2;
		border = w + h + b;
		System.out.println(area+", "+border);
		
		return new int[] {area, border};
	}
}
