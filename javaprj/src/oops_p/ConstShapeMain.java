package oops_p;

class ConstShape {
	int area, border;
	String name;
	
	ConstShape(int r) {
		this("원", (int)(3.14*r*r+0.5), (int)(2*3.14*r));
	}
	ConstShape(int x, int y) {
		this("직사각형", x*y, 2*(x*y));
	}
	ConstShape(int x, int y, int h) {
		this("직삼각형", x*y/2, x*y*h);
	}
	
	ConstShape(String name, int area, int border) {
		this.name = name;
		this.area = area;
		this.border = border;
	}
	void ppp() {
		String ttt = name+"\t"+area+"\t"+border;
		System.out.println(ttt);
	}
}

public class ConstShapeMain {

	public static void main(String[] args) {

		ConstShape [] shape = {
				new ConstShape(5),
				new ConstShape(5, 6),
				new ConstShape(5, 6, 8),
				new ConstShape(18, 4),
				new ConstShape(8),
				new ConstShape(10, 6, 13),
		};
		
		for (ConstShape cs : shape) {
			cs.ppp();
		}
		
	}

}
