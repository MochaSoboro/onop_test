package lang_p;

import java.util.Arrays;

//입력값에 따라 도형클래스를 생성하여 도형의 넓이를 계산하세요
/// 1. 인터페이스를 이용한 다형성형태로 만들것
/// 2. 입력형태 사각형   원   삼각형
/// 3. 실행메소드 void excute()
/// 4. 동적 바인딩 사용할 것

interface ShapeInterface {
	void execute(int ...line);
}

class ShapeCircle implements ShapeInterface {
	int area, border;
	@Override
	public void execute(int ...line) {
		area = (int)(Math.PI * Math.pow(line[0], 2));
		border = (int)(2 * Math.PI * line[0]);
		System.out.println("원\t"+area+"\t"+border);
	}
}
class ShapeRectangle implements ShapeInterface {
	int area, border;
	@Override
	public void execute(int ...line) {
		area = line[0] * line[1];
		border = 2 * (line[0] + line[1]);
		System.out.println("사각형\t"+area+"\t"+border);
	}
}
class ShapeTriangle implements ShapeInterface {
	int area, border;
	@Override
	public void execute(int ...line) {
		area = line[0] * line[1] / 2;
		border = line[0] + line[1] + line[2];
		System.out.println("삼각형\t"+area+"\t"+border);
	}
}

public class ClassShapeMain {
	
	static ShapeInterface calcGo(String name) throws Exception {
		return (ShapeInterface)Class.forName("lang_p.Shape"+name).newInstance();
	}

	public static void main(String[] args) {
		try {
			calcGo("Rectangle").execute(2, 4);
			calcGo("Circle").execute(3);
			calcGo("Triangle").execute(3, 4, 5);
			calcGo("Circle").execute(7);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
