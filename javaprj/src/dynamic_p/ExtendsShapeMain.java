package dynamic_p;

class ShapeParent {
	String name;
	int area, border;
	
	void ppp() {
		System.out.println(name+"\t"+area+"\t"+border);
	}
}

class ShapeChild extends ShapeParent {
	ShapeChild(int r) {
		name = "원";
		area = (int)(3.14*r*r);
		border = (int)(2*3.14*r);
	}
	ShapeChild(int w, int h) {
		name = "직사각형";
		area = w*h;
		border = 2*(w+h);
		
	}
	ShapeChild(int w, int h, int b) {
		name = "직삼각형";
		area = w*h/2;
		border = w+h+b;
	}
}
public class ExtendsShapeMain {

	public static void main(String[] args) {
		new ShapeChild(5).ppp();
		new ShapeChild(5, 12).ppp();
		new ShapeChild(4, 3, 5).ppp();
		new ShapeChild(5, 5).ppp();
		new ShapeChild(3, 7, 9).ppp();
		new ShapeChild(9).ppp();
	}

}
