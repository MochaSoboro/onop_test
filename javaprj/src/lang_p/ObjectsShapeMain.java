package lang_p;

class ObjShape {
	String name;
	int area, border;
	
	public ObjShape(int r) {
		this.name = "원";
		area = (int)(3.14 * r * r);
		border = (int)(2 * 3.14 * r);
	}
	public ObjShape(int w, int h) {
		this.name = "직사각형";
		area = w * h;
		border = 2 * (w + h);
	}
	public ObjShape(int w, int h, int b) {
		this.name = "직삼각형";
		area = (w * h) / 2;
		border = w + h + b;
	}

	
	@Override
	public String toString() {
		return name+"\t[넓이 : "+area+"]\t[둘레 : "+border+"]";
	}
	
}

public class ObjectsShapeMain {

	public static void main(String[] args) {
		int [] areas = new int[3];
		int [] borders = new int[3];
		String [] name = {"원", "직사각형", "직삼각형"};
		
		ObjShape [] shapes = {
				new ObjShape(5),
				new ObjShape(4, 7),
				new ObjShape(11, 5, 7),
				new ObjShape(9),
				new ObjShape(9, 4),
		};
		
		for (ObjShape sh : shapes) {
			System.out.println(sh);
			if (sh.name.equals(name[0])) {
				areas[0] += sh.area;
				borders[0] += sh.border;
			}
			else if (sh.name.equals(name[1])) {
				areas[1] += sh.area;
				borders[1] += sh.border;
			}
			else if (sh.name.equals(name[2])) {
				areas[2] += sh.area;
				borders[2] += sh.border;
			}
		}
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.println(name[i]+"\t[넓이 : "+areas[i]+"]\t[둘레 : "+borders[i]+"]");
		}
	}

}
