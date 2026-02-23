package oops_p;

import java.util.Arrays;

class Shape {
	String name;
	int [] line;
	int area, border;
	
	void init(int ...line) {
		this.name = new String[] {"원", "직사각형", "직삼각형"}[line.length-1];
		this.line = line;
		switch(line.length) {
			case 1:
				cirCalc();
				break;
			case 2:
				quadCalc();
				break;
			case 3:
				triCalc();
				break;
		}
	}
	
	void cirCalc() {
		this.area = (int)(3.14 * this.line[0] * this.line[0] + 0.5);
		this.border = (int)(2 * 3.14 * this.line[0] + 0.5);
	}
	
	void quadCalc() {
		this.area = this.line[0] * this.line[1];
		this.border = 2 * (this.line[0] + this.line[1]);
	}
	
	void triCalc() {
		this.area = this.line[0] * this.line[1] / 2;
		this.border = this.line[0] + this.line[1] + this.line[2];
	}
	
	void ppp() {
		String ppp;
		if (this.name == "직삼각형") {			
			ppp = this.name + "\t" + Arrays.toString(line)+"\t"+this.area+"\t"+this.border;
		}
		else {
			ppp = this.name + "\t" + Arrays.toString(line)+"\t"+"\t"+this.area+"\t"+this.border;
		}
		
		System.out.println(ppp);
		
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		int [][] len = {
				{5},
				{5, 6},
				{5, 6, 8},
				{10, 4},
				{8},
				{10, 6, 13}
		};
		
		Shape [] sh = new Shape[6];
		for (int i=0; i<6; i++) {
			sh[i] = new Shape();
			sh[i].init(len[i]);
		}
		
		for (Shape ss : sh) {
			ss.ppp();
		}
		
		
		
	}

}
