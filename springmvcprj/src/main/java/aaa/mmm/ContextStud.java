package aaa.mmm;

import lombok.Data;

@Data
public class ContextStud {
	int id, kor, eng, mat, total, average;

	public ContextStud(int id, int kor, int eng, int mat) {
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total = kor + eng + mat;
		average = Math.round(total/3);
	}
	
}
