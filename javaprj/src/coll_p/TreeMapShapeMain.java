package coll_p;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*
TreeMapShapeMain
도형이름별로 카테고리화 하고 정렬하여 출력하세요
도형 정보 : 이름, 넓이, 둘레

정렬순서 : 이름 - 직각삼각형>원>직사각형
         넓이(오름차순)
         둘레(내림차순)

        이름 , 넓이, 둘레 모두 같을 경우 생략 
 */

class TreeShape implements Comparable<TreeShape> {
	enum ShapeName {
		직각삼각형, 원, 직사각형
	}
	ShapeName name;
	int area, border;
	
	TreeShape(int r) {
		name = ShapeName.원;
		area = (int)(Math.pow(r, 2)*Math.PI);
		border = (int)(r*2*Math.PI);
	}
	TreeShape(int w, int h) {
		name = ShapeName.직사각형;
		area = w * h;
		border = (w + h)*2;
	}
	TreeShape(int w, int h, int b) {
		name = ShapeName.직각삼각형;
		area = w * h / 2;
		border = w + h + b;
	}
	
	@Override
	public String toString() {
		return name + "\t" + area + "\t" + border;
	}
	@Override
	public int compareTo(TreeShape you) {
		int res = area - you.area;	// 오름차순
		if (res == 0) {
			res = you.border - border;	// 내림차순
		}
		return res;
	}
}


public class TreeMapShapeMain {

	public static void main(String[] args) {
		
		TreeShape [] shapes = {
				new TreeShape(1),
				new TreeShape(1, 2),
				new TreeShape(1, 2, 3),
				new TreeShape(2, 4),
				new TreeShape(4, 2, 5),
				new TreeShape(4, 2, 5),
				new TreeShape(5),
				new TreeShape(3),
				new TreeShape(2, 3),
				new TreeShape(6, 8),
				new TreeShape(4, 12),
				new TreeShape(5, 6, 8),
				new TreeShape(7, 2),
		};
		TreeMap<TreeShape.ShapeName, TreeSet<TreeShape>> res = new TreeMap();
		
		for (TreeShape sh : shapes) {
			TreeSet<TreeShape> nameSet;
			if (res.containsKey(sh.name)) {
				nameSet = res.get(sh.name);
			}
			else {
				nameSet = new TreeSet();
			}
			
			res.put(sh.name, nameSet);
			nameSet.add(sh);
			
		}
//		System.out.println(res);
		for (Map.Entry<TreeShape.ShapeName, TreeSet<TreeShape>> nameSet : res.entrySet()) {
//			Map.Entry<TreeShape.ShapeName, TreeSet> nameSet = (Map.Entry)obj1;
			System.out.println(nameSet.getKey()+">>>>");
			
			for (TreeShape obj : nameSet.getValue()) {
				System.out.println(obj);
			}
			
		}
	}

}
