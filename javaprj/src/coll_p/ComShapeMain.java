package coll_p;

import java.util.TreeSet;

class ComShapeData implements Comparable {
	EShape name;
	int area, border;
	
	enum EShape{
		원, 직사각형, 직각삼각형
	}
	
	ComShapeData(int r) {
		this.name = EShape.valueOf("원");
		this.area = (int)(Math.PI*Math.pow(r, 2));
		this.border = (int)(2*Math.PI*r);
	}
	ComShapeData(int w, int h) {
		this.name = EShape.valueOf("직사각형");
		this.area = w*h;
		this.border = 2*(w+h);
	}
	ComShapeData(int w, int h, int b) {
		this.name = EShape.valueOf("직각삼각형");
		this.area = w*h/2;
		this.border = w+h+b;
	}

	@Override
	public String toString() {
		return name + "\t\t" + area + "\t\t" + border;
	}

	@Override
	public int compareTo(Object o) {
		ComShapeData you = (ComShapeData)o;
		int res = name.ordinal() - you.name.ordinal();
		if (res == 0) {
			res = area - you.area;
		}
		if (res == 0) {
			res = you.border - border;
		}
		return res;
	}
	
}

public class ComShapeMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new ComShapeData(5, 6));
		ts.add(new ComShapeData(5));
		ts.add(new ComShapeData(6));
		ts.add(new ComShapeData(15, 7));
		ts.add(new ComShapeData(10, 3));
		ts.add(new ComShapeData(6, 5, 8));
		ts.add(new ComShapeData(3, 10, 8));
		ts.add(new ComShapeData(3, 5, 7));
		ts.add(new ComShapeData(11));
		ts.add(new ComShapeData(3, 5, 6));
		
		System.out.println("도형이름(C>R>T)\t넓이(오름차순)\t둘레(내림차순)");
		for (Object obj : ts) {
			System.out.println(obj);
		}
	}

}
