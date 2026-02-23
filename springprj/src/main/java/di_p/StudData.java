package di_p;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

class Stud {
	String name;
	int kor, eng, mat, tot, avg, rank = 1;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getAvg() {
		return avg;
	}
	public void calc() {
		tot = kor + eng + mat;
		avg = tot/3;
	}
	@Override
	public String toString() {
		calc();
		return "Stud [name=" + name + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
	
}

public class StudData {	
	Stud [] arr;

	public void setArr(Stud[] arr) {
		this.arr = arr;
	}

	public void setRank() {
		for (Stud stud : arr) {
			System.out.println(stud);
		}
		
		for (Stud stud : arr) {
			for (Stud stud2 : arr) {
				if (stud.avg < stud2.avg) {
					stud.setRank(stud.getRank()+1);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		setRank();
		return "StudData [arr=" + Arrays.toString(arr) + "]";
	}

	
}
