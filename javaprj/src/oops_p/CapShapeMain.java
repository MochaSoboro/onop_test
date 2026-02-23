package oops_p;

/*

oops_p.CapShapeMain
도형 클래스를 구현하세요

생성시에만 입력가능

직사각형 -> 가로, 세로
원 -> 반지름


출력만 가능 

도형 정보 : 도형종류(직사각형, 원), 넓이, 둘레
 * */

class CapShape {
	private int area, border;
	private String name;

	public CapShape(int r) {
		area = (int)(3.14 * r * r);
		border = (int)(2 * 3.14 * r);
		name = "원";
	}
	
	public CapShape(int x, int y) {
		area = x * y;
		border = 2 * (x + y);
		name = "직사각형";
	}
	
	public String getName() {
		return name;
	}
	
	public int getArea() {
		return area;
	}
	
	public int getBorder() {
		return border;
	}
	
}

public class CapShapeMain {

	public static void main(String[] args) {
		CapShape [] shapes = {
				new CapShape(4),
				new CapShape(3, 5),
				new CapShape(7),
				new CapShape(8, 6),
		};
		
		for (CapShape sh : shapes) {
			System.out.println(sh.getName()+"\t"+sh.getArea()+"\t"+sh.getBorder());
		}
	}

}
