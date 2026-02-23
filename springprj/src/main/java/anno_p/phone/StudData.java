package anno_p.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


class Stud {
	
	String name;
	int kor;
	int eng;
	int mat;
	int tot, avg, rank = 1;
	
	
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
	
	
	
	
	public int getAvg() {
		return avg;
	}
	public void calc() {
		tot = kor + eng + mat;
		avg = tot/3;
	}
	
	public void calcRank(List<Stud> studs) {
		for (Stud st : studs) {
			if(st.getAvg()>getAvg()) {
				rank++;
			}
		}
	}
	
	@Override
	public String toString() {
		calc();
		return "Stud [name=" + name + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
	
}

public class StudData {	
	@Autowired
	List<Stud> arr;
	
	public void setArr(List<Stud> arr) {
		this.arr = arr;
	}

	void ppp() {
		arr.forEach(ss->ss.calcRank(arr));
		arr.forEach(ss->System.out.println(ss));
	}

	
	
	

	
}
